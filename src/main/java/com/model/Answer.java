package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "answer")
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "answer_id")
  private long answerId;

  @Column(name = "answer")
  private String answer;

  @JsonBackReference(value = "answer")
  @OneToOne(mappedBy = "answer")
  private Question question;

}
