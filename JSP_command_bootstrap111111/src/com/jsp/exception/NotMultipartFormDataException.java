package com.jsp.exception;

public class NotMultipartFormDataException extends Exception{
   
   public NotMultipartFormDataException() {
      super("Multipart 평식이 아닙니다.");
   }
   
}