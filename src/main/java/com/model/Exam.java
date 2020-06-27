package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "exam_id")
  private long examId;

  @Column(name = "exam_name")
  private String examName;

  @JsonBackReference(value = "faculty")
  @ManyToOne
  @JoinColumn(name = "faculty_id")
  private Faculty faculty;

  @JsonManagedReference(value = "exam")
  @OneToMany(mappedBy = "exam")
  private List<Question> questions;

}
