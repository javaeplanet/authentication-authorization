package com.javaeplanet.auth.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	private String sname;
	private String sclass;
	private String email;
	private String password;
	private String phoneNumber;
	private String collegeName;
	@ManyToMany
	@JoinTable(name="std_role",joinColumns = @JoinColumn(name="std_id"),
	inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Role> roles;

}
