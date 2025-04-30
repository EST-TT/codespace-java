package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.CombineService;
import com.example.demo.utils.JsonParser;

@RestController
public class HelloWorldController {
    
    private final CombineService combineService;
    // Constructor injection for CombineService
    @Autowired
    public HelloWorldController(CombineService combineService) {
        this.combineService = combineService;
    }

    // Endpoint to read a CSV file and return its content as a list of strings
    @GetMapping("/convert")
    public String sayHello() {
        // Path to the CSV file
        String MAIN_PATH = "data/";
        // List<String> filesList = Arrays.asList(
        //     "10604_Plan.csv",
        //     "Global_ReinsPlanTypeNo.csv",
        //     "Global_BenefitNo.csv",
        //     "Global_SubBenefitNo.csv",
        //     "19-01_PremSplit.csv"
        // );

        // List<String> parqueList = new ArrayList<>();

        // // convert all csv file to parquets
        // filesList.forEach(file -> {
        //     String filePath = MAIN_PATH + file;
        //     String fileOutput = MAIN_PATH + file.replace(".csv", ".parquet");
        //     parqueList.add(combineService.convertToParquet(filePath, fileOutput));
        // });

        // List<HcombineMember> hcombineMembers = Arrays.asList(
        //     // 10604_Plan
        //     new HcombineMember("10604_Plan", 
        //     Arrays.emptyList(), 
        //     Arrays.emptyList(), 
        //     "inner", 
        //     null, 
        //     1),

        //     // Global_ReinsPlanTypeNo
        //     new HcombineMember("Global_ReinsPlanTypeNo",
        //     Arrays.emptyList(), 
        //     Arrays.asList("ReinsPlanTypeNo"),
        //     "inner", 
        //     null, 
        //     2),

            
        //     // Global_BenefitNo
        //     new HcombineMember("Global_BenefitNo", 
        //     Arrays.emptyList(), 
        //     Arrays.asList("BenefitNo"), 
        //     "inner", 
        //     null, 
        //     3),

        //     // Global_SubBenefitNo
        //     new HcombineMember("Global_SubBenefitNo", null, Arrays.asList("SubBenefitNo"), "inner", null, 4),
        //     // 19-01_PremSplit
        //     new HcombineMember("19-01_PremSplit", null, Arrays.asList("PremSplitID"), "inner", null, 5)
        // );



        // // read specific columns from the Parquet file
        // List<String> csvContent = combineService.readParquetAsList(file1);

        

        // Return the content as a response
        return "csvContent";
    }


}