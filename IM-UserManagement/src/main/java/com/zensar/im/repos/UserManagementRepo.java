package com.zensar.im.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.im.entities.UserEntity;
@Repository
public interface UserManagementRepo extends JpaRepository<UserEntity, Integer>{

}
