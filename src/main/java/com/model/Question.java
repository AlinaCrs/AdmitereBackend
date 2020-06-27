package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Question {

  @Column(name = "")
  private long questionId;

  @Column(name = "")
  private String question;

  @Column(name = "")
  private long answerId;

  @Column(name = "")
  private long examId;


}
