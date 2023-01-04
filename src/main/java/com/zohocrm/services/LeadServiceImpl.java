package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Lead;
import com.zohocrm.repositores.LeadRepo;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepo leadRepo;
	

	@Override
	public void saveOneLead(Lead lead) {
      leadRepo.save(lead);
	}


	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
		
	}


	@Override
	public List<Lead> getAllLeads() {
    List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
