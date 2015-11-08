package com.example.tests;

import static org.testng.Assert.assertEquals;
import java.util.Collections;
import java.util.List;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  @Test
  public void testNonEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    //save old state
  	List<ContactData> oldList = app.getContactHelper().getContacts();
  	
  	//action
  	app.getContactHelper().initContactCreate();
    ContactData contact = new ContactData();
    contact.firstName = "fname1";
    contact.lastName = "00lname1";
    contact.address ="address1";
    contact.homePhone = "1122334455";
    contact.mobilePhone = "1122334466";
    contact.workPhone = "1122334477";
    contact.email = "Annet80@mail.ru";
    contact.email2 = "Dyl@,mail.ru";
    contact.birthday = "10";
    contact.birthmonth = "March";
    contact.contactGroup = "7777";
    contact.addressSecond = "address sec 1";
    contact.homeSecond = "home 1";    
	app.getContactHelper().fillContactForm(contact);
	app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactsPage();
  //save new state
	
  	List<ContactData> newList= app.getContactHelper().getContacts();
  	
  	//compare state
  	//assertEquals(newList.size(), oldList.size() + 1) ;
      oldList.add(contact);
      Collections.sort(oldList);
      assertEquals(newList, oldList);
  }
  
  //@Test
  public void testEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreate();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactsPage();
  }
}
