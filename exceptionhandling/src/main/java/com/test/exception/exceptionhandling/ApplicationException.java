package com.test.exception.exceptionhandling;

import lombok.Data;

@Data
public class ApplicationException extends Exception{

    private int statusCode;
    private String message;

   public ApplicationException(int aStatusCode,String aMessage){
      this.statusCode = aStatusCode;
      this.message = aMessage;
   }
}
