package com.test.exception.controller;

import com.test.exception.exceptionhandling.ApplicationException;
import com.test.exception.model.Question;
import com.test.exception.service.QuestionService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("question/{id}")
    public ResponseEntity<?> getQuestion(@PathVariable int id) throws ApplicationException {

          Question q  = questionService.getQuestionById(id);

        return new ResponseEntity<>(q,HttpStatus.OK);
    }

}
