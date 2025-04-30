package com.example.demo.config;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {

    @Bean
    SparkSession sparkSession() {
        try {
            System.out.println("Initializing SparkConf...");
            SparkConf sparkConf = new SparkConf()
                    .setAppName("Spring Boot with Spark")
                    .setMaster("local[*]"); // Use local mode with all available cores

            return SparkSession.builder()
                    .config(sparkConf)
                    .getOrCreate();
        } catch (Exception e) {
            System.err.println("Error creating SparkSession: " + e.getMessage());
            throw new RuntimeException("Failed to create SparkSession", e);
        }
    }
}