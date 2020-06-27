package com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Doc {

  @Column(name = "")
  private long docId;

  @Column(name = "")
  private String docType;

  @Column(name = "")
  private String serialNo;

  @Column(name = "")
  private String registrationNo;

  @Column(name = "")
  private String expireDate;

  @Column(name = "")
  private long userId;

}
