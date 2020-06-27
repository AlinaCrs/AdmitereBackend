package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "doc")
public class Doc {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "doc_id")
  private long docId;

  @Column(name = "doc_type")
  private String docType;

  @Column(name = "serial_no")
  private String serialNo;

  @Column(name = "registration_no")
  private String registrationNo;

  @Column(name = "expire_date")
  private String expireDate;

  @JsonBackReference(value = "user")
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

}
