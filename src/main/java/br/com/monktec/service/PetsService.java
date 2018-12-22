package br.com.monktec.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.monktec.models.Pets;
import br.com.monktec.repositories.PetsRepository;

@Service
public class PetsService {

	@Autowired
	private PetsRepository petsRepository;
	
	public List<Pets> getAllPets() {
		return petsRepository.findAll();
	}
	
	public Pets getPetById(ObjectId id) {
		return petsRepository.findById(id);
	}
	
	public void modifyPetById(ObjectId id, Pets pets) {
		pets.setId(id);
		petsRepository.save(pets);
	}
	
	public Pets createPets(Pets pets) {
		pets.setId(ObjectId.get());
		petsRepository.save(pets);
		return pets;
	}
	
	public void deletePet(ObjectId id) {
		petsRepository.delete(petsRepository.findById(id));
	}
	
	public Pets getPetByName(String name) {
		return petsRepository.findByName(name);
	}
}
