package com.zensar.im.services;

import com.zensar.im.entities.AdminEntity;

public interface AdminManagementService {
	
	public AdminEntity createUser(AdminEntity e);
	public AdminEntity getByid(int id);

}
