package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "grade")
public class Grade {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "grade_id")
  private long gradeId;

  @Column(name = "grade")
  private double grade;

  @Column(name = "user_id")
  private long userId;

  @Column(name = "exam_id")
  private long examId;

}
