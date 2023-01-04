package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entites.Billing;
import com.zohocrm.entites.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
    @Autowired
	private ContactService contactService;
    
    @Autowired
    private BillingService billingService;
    
    @RequestMapping("/listcontact")
    public String listContact(Model model) {
    	List<Contact> contact = contactService.getContact();
    	model.addAttribute("contacts",contact);
    	return"list_contacts";
    }
    @RequestMapping("/createBill")
    public String createBill(@RequestParam("id")long id,Model model) {
    	Contact contact = contactService.getContactById(id);
    	model.addAttribute("contact",contact);
    	return "generate_bill";
    }
    @RequestMapping("/saveBill")
    public String saveBill(Billing bill) {
    	billingService.generatedBill(bill);
    	return"list_bills";
    }
}

