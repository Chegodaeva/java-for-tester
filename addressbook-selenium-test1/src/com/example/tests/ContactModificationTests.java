package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void modifySomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().selectContactForEditByIndex(1);
		ContactData contact = new ContactData();
		contact.firstName = "Anna";
		contact.birthday = "25";
		contact.birthmonth = "May";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
	}

}
