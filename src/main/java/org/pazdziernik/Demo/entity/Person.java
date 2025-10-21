package org.pazdziernik.Demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person")  // opcjonalnie, jeśli chcesz nazwać tabelę
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	// konstruktor bezargumentowy (wymagany przez JPA)
	public Person() {}

	public Person(String name) {
		this.name = name;
	}

	// getter i setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
