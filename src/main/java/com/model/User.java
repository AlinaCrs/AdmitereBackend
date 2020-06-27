package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

  @Column(name = "")
  private long userId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "cnp")
  private long cnp;

  @Column(name = "email")
  private String email;

  @Column(name = "phone")
  private String phone;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "")
  private long roleId;

  @Column(name = "")
  private long gradeId;

}
