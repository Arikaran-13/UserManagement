package com.zensar.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.im.entities.UserEntity;
import com.zensar.im.services.UserManagementService;

import java.util.*;

@RestController
@RequestMapping("/interview-management")
public class UserManagementController {
	
	@Autowired
	UserManagementService s;
	
	@PostMapping // story 3
	public ResponseEntity<UserEntity> createUser( @RequestBody UserEntity u) {
		
		return new ResponseEntity<UserEntity>(s.createUser(u),HttpStatus.CREATED);
	}
	
  //story 4
	@GetMapping("/user")
	public ResponseEntity<ResponseEntity> getUser(@PathVariable("id")int id) {
		
		return new ResponseEntity<>(s.getUser(id),HttpStatus.FOUND);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<UserEntity>>getUserAll(){
		
		return new ResponseEntity<List<UserEntity>>(s.getAll(),HttpStatus.FOUND);
	}
	
	@DeleteMapping("/logout/{id}") //2
	public ResponseEntity<Boolean> logout(@PathVariable("id")int id) {
		
		return new ResponseEntity<Boolean>(s.DeleteUser(id),HttpStatus.);
	}
	
	
}
