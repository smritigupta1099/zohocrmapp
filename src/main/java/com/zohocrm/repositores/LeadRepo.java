package com.zohocrm.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
