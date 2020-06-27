package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Grade {

  @Column(name = "")
  private long gradeId;

  @Column(name = "")
  private double grade;

  @Column(name = "")
  private long examId;

}
