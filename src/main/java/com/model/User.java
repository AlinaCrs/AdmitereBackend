package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  private long userId;
  private String firstName;
  private String lastName;
  private String cnp;
  private String e_Mail;
  private String phone;
  private long roleFkId; 
  
  String cevaTest;


}
