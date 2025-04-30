package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombineService {

    @Autowired
    private SparkSession sparkSession;

    public Dataset<Row> readCsv(String filePath) {
        return sparkSession.read()
                .option("header", "true") // Treat the first row as a header
                .option("inferSchema", "true") // Infer the schema automatically
                .csv(filePath);
    }

    // read a csv file and return it content as List<String>
    public List<String> readCsvAsList(String filePath) {
        return readCsv(filePath)
                .collectAsList()
                .stream()
                .map(row -> row.mkString(","))
                .collect(Collectors.toList());
    }

    // save as parquet
    public void saveAsParquet(Dataset<Row> dataset, String outputPath) {
        dataset.write()
                .mode("overwrite") // Overwrite mode
                .parquet(outputPath);
    }

    //convert csv to parquet
    public String convertToParquet(String inputPath, String outputPath) {
        Dataset<Row> csvData = readCsv(inputPath);
        saveAsParquet(csvData, outputPath);
        return outputPath;
    }

    // read parquet file with sql
    public List<String> readParquetAsList(String filePath) {
        // Register the Parquet file as a temporary SQL table
        Dataset<Row> parquetData = sparkSession.read().parquet(filePath);
        parquetData.createOrReplaceTempView("parquet_table");

        // Use Spark SQL to select the 'name' and 'age' columns
        Dataset<Row> result = sparkSession.sql("SELECT name, age FROM parquet_table");

        // Convert the result to a list of strings
        return result.collectAsList()
                    .stream()
                    .map(row -> row.mkString(",")) // Combine 'name' and 'age' into a single string
                    .collect(Collectors.toList());
    }







    
}