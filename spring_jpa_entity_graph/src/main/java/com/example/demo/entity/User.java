package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = "jhanu_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	
	@Column( name = "id")
	int id;
	
	@Column(name = "name")
	 String name;
	
	@Column(name = "phone_number")
 long phoneNumber;
	

}
