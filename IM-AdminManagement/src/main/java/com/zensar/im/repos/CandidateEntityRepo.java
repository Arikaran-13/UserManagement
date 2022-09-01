package com.zensar.im.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.im.entities.CandidatesEntity;

@Repository
public interface CandidateEntityRepo  extends JpaRepository<CandidatesEntity, Integer>{

}
