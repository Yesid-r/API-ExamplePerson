package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Person;
import com.example.demo.services.PersonService;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping("/listPersons")
	public List<Person> listPersons() {
		return personService.listPersons();
	}
	
	@GetMapping("/listMaxSalary/{maxValue}")
	public List<Person> listMaxSalary(@PathVariable Long maxValue){
		return personService.listMaxSalary(maxValue);
	}
}
