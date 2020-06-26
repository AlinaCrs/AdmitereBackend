package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doc {

  private long docId;
  private String docType;
  private String serialNo;
  private String registrationNo;
  private String expireDate;
  private long userDocFkId;


}
