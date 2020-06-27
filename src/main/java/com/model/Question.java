package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "question_id")
  private long questionId;

  @Column(name = "question")
  private String question;

  @JsonManagedReference(value = "answer")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "answer_id")
  private Answer answer;

  @JsonBackReference(value = "exam")
  @ManyToOne
  @JoinColumn(name = "exam_id")
  private Exam exam;


}
