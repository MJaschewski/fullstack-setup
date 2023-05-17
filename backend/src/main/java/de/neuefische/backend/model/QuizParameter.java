package de.neuefische.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuizParameter {
    private String difficulty;
    private String gerne;
    private int numQuestion;
}
