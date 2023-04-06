package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Person;
import com.example.demo.repositories.IARepositoriPerson;

@Service
public class PersonService {
	
	@Autowired
	private IARepositoriPerson iaRepositoriPerson;
	
	public Person savePerson(Person person) {
		iaRepositoriPerson.save(person);
		return person;
	}
	
	public List<Person> listPersons(){
		return iaRepositoriPerson.findAll();
	}
	
	public List<Person> listMaxSalary(Long maxValue){
		return iaRepositoriPerson.listMaxSalary(maxValue);
	}
}
