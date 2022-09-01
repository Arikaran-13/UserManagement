package com.zensar.im.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.im.entities.AdminEntity;
import com.zensar.im.repos.AdminManagementRepo;
import com.zensar.im.services.AdminManagementService;

@Service
public class AdminManagementServiceImpl implements AdminManagementService {

	@Autowired
	AdminManagementRepo repo;
	
	@Override
	public AdminEntity createUser(AdminEntity e) {
	     
		return repo.save(e);
	}

	@Override
	public AdminEntity getByid(int id) {
		return repo.findById(id).get();
	}

}
