package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  @Test
  public void testNonEmptyContactCreation() throws Exception {
    openMainPage();
    initContactCreate();
    ContactData contact = new ContactData();
    contact.firstName = "fname1";
    contact.lastName = "lname1";
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
	fillContactForm(contact);
	submitContactCreation();
    returnToContactsPage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
    openMainPage();
    initContactCreate();
    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
    submitContactCreation();
    returnToContactsPage();
  }
}
