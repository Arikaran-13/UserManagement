package com.zensar.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.im.entities.AdminEntity;
import com.zensar.im.entities.CandidatesEntity;
import com.zensar.im.services.AdminManagementService;
import com.zensar.im.services.CandidateEntityService;

@RestController
@RequestMapping("/interview-management")
public class AdminManagementController {
  
	@Autowired
	AdminManagementService s;
	
	@Autowired
    CandidateEntityService ces;
	
	@PostMapping("/candidate") //story 6
	public AdminEntity createUser(@RequestBody AdminEntity ae) {
	     
		return s.createUser(ae);
		
	}
	@GetMapping("/get{id}") //story 7
	public AdminEntity getByid(@PathVariable("id")int id) {
		
	 return s.getByid(id);
	}
	@PostMapping("/interview")
	public CandidatesEntity createCandidate(CandidatesEntity ce) {
		  return ces.createUser(ce);
	}
}
