package com.zensar.im.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.im.entities.CandidatesEntity;
import com.zensar.im.repos.CandidateEntityRepo;
import com.zensar.im.services.CandidateEntityService;

@Service
public class CandidateEntityServiceImpl implements CandidateEntityService{

	@Autowired
	CandidateEntityRepo repo;
	@Override
	public CandidatesEntity createUser(CandidatesEntity e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

}
