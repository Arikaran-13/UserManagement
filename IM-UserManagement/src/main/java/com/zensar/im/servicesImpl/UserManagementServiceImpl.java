package com.zensar.im.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.zensar.im.entities.UserEntity;
import com.zensar.im.exceptions.ResourceNotFoundException;
import com.zensar.im.repos.UserManagementRepo;
import com.zensar.im.services.UserManagementService;

@Service
public class UserManagementServiceImpl implements UserManagementService{

	
	@Autowired
	UserManagementRepo repo;
	
	@Override
	public UserEntity createUser(UserEntity u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}

	@Override
	public UserEntity getUser(int id) {
		if( repo.findById(id).isEmpty()) {
			throw new ResourceNotFoundException("user id not found : "+id);
		}
		else {
			return repo.findById(id).get();
		}
		
	}

	@Override
	public List<UserEntity> getAll() {
	    
		return repo.findAll();
	}

	@Override
	public boolean DeleteUser(int id) {
		
		if(repo.findById(id).isEmpty()) {
			return false;
			}
		else {
		
		repo.deleteById(id);
		return true;
		}
	}

}
