package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import com.example.demo.DTOs.PersonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "PERSON")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDPERSON")
	private Long idPerson;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BIRTHDAY")
	private Date birthday;

	@Column(name = "SALARY")
	private Double salary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public PersonDTO toDTO() {
		PersonDTO personDTO = new PersonDTO();
		
		personDTO.setName(name);
		personDTO.setBirthday(birthday);
		
		return personDTO;
	}
}
