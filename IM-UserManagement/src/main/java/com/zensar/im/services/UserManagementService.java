package com.zensar.im.services;

import com.zensar.im.entities.UserEntity;

import java.util.*;

import org.springframework.http.ResponseEntity;

public interface UserManagementService {
     
	public ResponseEntity<UserEntity> createUser(UserEntity u);
	public ResponseEntity<UserEntity> getUser(int id);
	public ResponseEntity<List<UserEntity>> getAll();
	public ResponseEntity<Boolean> DeleteUser(int id);
}
