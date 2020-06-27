package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Role {

  @Column(name = "")
  private long roleId;

  @Column(name = "")
  private String role;

}
