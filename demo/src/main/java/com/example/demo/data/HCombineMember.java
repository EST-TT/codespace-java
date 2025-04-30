package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HCombineMember {
    private String table;               // Table/file name (e.g., "A")
    private List<String> selectionColumns; // Columns to include in results
    private List<String> keyColumns;    // Join conditions (e.g., ["A.id=B.id"])
    private String type;                // Join type (master/inner/outer)
    private List<String> columns;       // All columns in the file
    private int label;                  // Priority (1=highest)
    // Getters/setters
}