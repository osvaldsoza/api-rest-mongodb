package br.com.monktec.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.monktec.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

	public Users findByUsername(String username);
}
