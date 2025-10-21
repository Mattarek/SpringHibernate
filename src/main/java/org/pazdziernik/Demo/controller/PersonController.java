package org.pazdziernik.Demo.controller;

import org.pazdziernik.Demo.entity.Person;
import org.pazdziernik.Demo.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	private final PersonService service;

	public PersonController(PersonService service){
		this.service = service;
	}

	@GetMapping
	public List<Person> all(){
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Person getOne(@PathVariable Long id){
		return service.getOnePerson(id);
	}


	@PostMapping
	public ResponseEntity<Person> create(@RequestBody Person p){
		Person saved = service.save(p);
		return ResponseEntity.ok(saved);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
