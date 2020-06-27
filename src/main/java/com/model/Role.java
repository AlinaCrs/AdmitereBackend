package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "role_id")
  private long roleId;

  @Column(name = "role")
  private String role;

  @JsonBackReference(value = "role")
  @OneToOne(mappedBy = "role")
  private User user;

}
