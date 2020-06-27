package com.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
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

  @JsonManagedReference(value = "role")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "role_id")
  private Role role;

  @JsonManagedReference(value = "user")
  @OneToMany(mappedBy = "user")
  private List<Doc> documents;

}
