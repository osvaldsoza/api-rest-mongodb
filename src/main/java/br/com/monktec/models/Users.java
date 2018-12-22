package br.com.monktec.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {

	@Id
	private ObjectId id;
	private String username;
	private String password;
	
	public Users() {}
	
	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
