package com.zensar.im.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.im.entities.AdminEntity;
@Repository
public interface AdminManagementRepo  extends JpaRepository<AdminEntity, Integer>{

}
