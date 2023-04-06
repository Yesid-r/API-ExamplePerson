package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;

@Repository
public interface IARepositoriPerson extends JpaRepository<Person, Long>{

	public Person findByIdPerson(Long idPerson);
	
	@Query(value = "SELECT p FROM Person p WHERE p.salary > :maxValue")
	public List<Person> listMaxSalary(Long maxValue);
}
