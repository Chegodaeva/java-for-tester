package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void modifySomeContact(){
		app.getNavigationHelper().openMainPage();
		//save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size());
		if(index>0){
		index = index - 1;}
		//actions	
		app.getContactHelper().selectContactForEditByIndex(index);
		ContactData contact = new ContactData();
		contact.lastName = "22222Lapina";
		contact.firstName = "22222Anna";
		//contact.birthday = "25";
		//contact.birthmonth = "May";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
		app.getContactHelper().returnToContactsPage();
		//save new state
		List<ContactData> newList= app.getContactHelper().getContacts();
		//compare state
		//assertEquals(newList.size(), oldList.size() + 1) ;
	    oldList.remove(index);
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}

}
