package com.zohocrm.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Billing;

public interface BillingRepo extends JpaRepository<Billing, Long> {

}
