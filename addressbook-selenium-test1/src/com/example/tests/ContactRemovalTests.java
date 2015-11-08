package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
@Test	
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		//save old state
				List<ContactData> oldList = app.getContactHelper().getContacts();
				Random rnd = new Random();
				int index = rnd.nextInt(oldList.size());
				if(index>0){
				index = index - 1;}
				
		//actions	
		app.getContactHelper().deleteContact(index);
		app.getContactHelper().returnToContactsPage();
		
		//save new state
		
				List<ContactData> newList= app.getContactHelper().getContacts();
				//compare state
				//assertEquals(newList.size(), oldList.size() + 1) ;
			    oldList.remove(index);
			    Collections.sort(oldList);
			    assertEquals(newList, oldList);
		
	}			
}
