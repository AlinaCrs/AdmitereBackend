package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Faculty {

  @Column(name = "")
  private long facultyId;

  @Column(name = "")
  private String facultyName;

  @Column(name = "")
  private String department;


}
