package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Billing;
import com.zohocrm.repositores.BillingRepo;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepo billingRepo;

	@Override
	public void generatedBill(Billing bill) {
		billingRepo.save(bill);

	}

}
