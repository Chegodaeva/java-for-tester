package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void returnToContactsPage() {
	click(By.linkText("add next"));
	  }

	public void submitContactCreation() {
		click(By.name("submit"));
	  }

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"),contact.firstName);
		type(By.name("lastname"),contact.lastName);
		type(By.name("address"),contact.address);
	    type(By.name("home"),contact.homePhone);
		type(By.name("mobile"),contact.mobilePhone);
		type(By.name("work"),contact.workPhone);
		type(By.name("email"),contact.email);
		type(By.name("email2"),contact.email2);
	    selectByText(By.name("bday"), contact.birthday);
	    selectByText(By.name("bmonth"), contact.birthmonth);
	    //selectByText(By.name("new_group"), contact.contactGroup);
	    type(By.name("address2"),contact.addressSecond);
	   	type(By.name("phone2"),contact.homeSecond);
	  }

	public void initContactCreate() {
		click(By.linkText("add new"));
		}
	public void deleteContact(int index) {
		selectContactForEditByIndex(index);
		click(By.xpath("//input[@value='Delete']"));
	}

	public void selectContactForEditByIndex(int index) {
		click(By.xpath(".//*[@id='maintable']/tbody/tr["+(index+1)+"]/td[7]/a/img"));		
	}

	public void submitContactModification(){
		click(By.xpath("//input[@value='Update']"));
		
	}

}
