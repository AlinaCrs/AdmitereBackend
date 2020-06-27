package com.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "faculty")
public class Faculty {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "faculty_id")
  private long facultyId;

  @Column(name = "faculty_name")
  private String facultyName;

  @Column(name = "department")
  private String department;

  @JsonManagedReference(value = "faculty")
  @OneToMany(mappedBy = "faculty")
  private List<Exam> exams;

}
