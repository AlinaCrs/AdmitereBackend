package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exam {

  private long examId;
  private String examName;
  private String examGrade;
  private long userFkId;
  private long facultyExamId;




}
