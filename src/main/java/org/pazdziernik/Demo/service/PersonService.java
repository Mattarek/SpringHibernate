package org.pazdziernik.Demo.service;

import org.pazdziernik.Demo.entity.Person;
import org.pazdziernik.Demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

	private final PersonRepository repository;

	public PersonService(PersonRepository repository){
		this.repository = repository;
	}

	public Person getOnePerson(Long id){
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Person not found with id " + id));
	}

	public List<Person> findAll(){
		return repository.findAll();
	}

	public Person save(Person p){
		return repository.save(p);
	}

	public void delete(Long id){
		repository.deleteById(id);
	}
}
