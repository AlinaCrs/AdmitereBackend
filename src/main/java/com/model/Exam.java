package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Exam {

  @Column(name = "")
  private long examId;

  @Column(name = "")
  private String examName;

  @Column(name = "")
  private long facultyId;


}
