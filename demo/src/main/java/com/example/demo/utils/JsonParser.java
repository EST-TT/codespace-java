package com.example.demo.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonParser {

    // public static void deleteColumnsType() {
    //     try {
    //         // Read the JSON file
    //         ObjectMapper objectMapper = new ObjectMapper();
    //         JsonNode rootNode = objectMapper.readTree(new File("data/testing_modified.json"));
            
    //         // Get the list array
    //         ArrayNode listNode = (ArrayNode) rootNode.get("list");
            
    //         // Iterate through each object in the list and remove columns_type
    //         for (JsonNode node : listNode) {
    //             if (node instanceof ObjectNode) {
    //                 ObjectNode objectNode = (ObjectNode) node;
    //                 objectNode.remove("columns_type");
    //             }
    //         }
            
    //         // Write the modified JSON back to the file
    //         objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("data/testing_modified.json"), rootNode);
            
    //         System.out.println("Successfully removed columns_type from the JSON file. Output saved to testing_modified.txt");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

}