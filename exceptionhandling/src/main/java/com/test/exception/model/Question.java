package com.test.exception.model;

import com.test.exception.service.QuestionService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String category;

    private String difficultyLevel;

    private String Option1;

    private String Option2;

    private String Option3;

    private String Option4;

    private String questionTitle;

    private String rightAnswer;



}
