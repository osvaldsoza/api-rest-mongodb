package br.com.monktec.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets {

	@Id
	public ObjectId id;
	
	public String name;
	public String species;
	public String breed;

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
