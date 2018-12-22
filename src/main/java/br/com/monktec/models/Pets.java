package br.com.monktec.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets {

	@Id
	public ObjectId id;
	
	public String name;
	public String species;
	public String breed;
	
	public Pets() {
		
	}
	
	public Pets(ObjectId id, String name, String species, String breed) {
		this.id = id;
		this.name = name;
		this.species = species;
		this.breed = breed;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
