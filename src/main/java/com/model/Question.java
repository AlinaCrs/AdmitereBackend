package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

  private long qId;
  private String question;
  private String answerId;
  private long examFkId;
  private long answerFkId;


}
