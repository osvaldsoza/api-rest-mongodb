package br.com.monktec.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.monktec.models.Pets;

public interface PetsRepository extends MongoRepository<Pets, String> {
	
	public Pets findById(ObjectId id);
	public Pets findByName(String name);
}
