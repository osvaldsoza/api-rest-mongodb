package br.com.monktec.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.monktec.models.Pets;
import br.com.monktec.service.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsController {

	@Autowired
	private PetsService petsService;

	@GetMapping
	public List<Pets> getAllPets() {
		return petsService.getAllPets();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pets> getPetById(@PathVariable("id") ObjectId id) {
		Pets pets = petsService.getPetById(id);
		return pets != null ? ResponseEntity.ok(pets) : ResponseEntity.notFound().build();
	}

	@PutMapping(value = "/{id}")
	public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
		pets.setId(id);
		petsService.modifyPetById(id, pets);
	}

	@PostMapping
	public Pets createPets(@Valid @RequestBody Pets pets) {
		pets.setId(ObjectId.get());
		petsService.createPets(pets);
		return pets;
	}

	@DeleteMapping(value = "/{id}")
	public void deletePet(@PathVariable ObjectId id) {
		petsService.deletePet(id);
	}
	
	@GetMapping("/find-by-name")
	public ResponseEntity<Pets> getFindByName(@PathParam(value = "name") String name) {
		Pets pets = petsService.getPetByName(name);
		return pets != null ? ResponseEntity.ok(pets) : ResponseEntity.notFound().build();
	}
}
