package com.test.exception.service;

import com.test.exception.exceptionhandling.ApplicationException;
import com.test.exception.model.Question;
import com.test.exception.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService{

    private final QuestionRepository questionRepository;

    private QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

   public Question getQuestionById(int id) throws ApplicationException {

       return questionRepository.findById(id).orElseThrow(()->
                new ApplicationException(404,
                "Question not found with id : " + id));
   }

// for extending runtime exceptions we dont need throws declaration and for exception we need to declare throws
}
