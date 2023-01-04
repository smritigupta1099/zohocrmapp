package com.zohocrm.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Contact;
import com.zohocrm.entites.Lead;

public interface ContactRepo extends JpaRepository<Contact, Long> {

}
