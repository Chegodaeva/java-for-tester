package com.example.fw;

import static com.example.fw.ContactHelper.CREATION;
import static com.example.fw.ContactHelper.MODIFICATION;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import com.example.tests.ContactData;
import com.example.tests.GroupData;
import com.example.utils.SortedListOf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
	
	public static boolean CREATION = true;
	public static boolean MODIFICATION = false;
	

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}
	
	private SortedListOf<ContactData> cachedContacts;
	public SortedListOf<ContactData> getContacts(){
		if(cachedContacts == null){
			rebuildCache();
		}
		return	cachedContacts;
    }
	private void rebuildCache() {
		cachedContacts = new SortedListOf<ContactData>();
		manager.navigateTo().mainPage();
		List<WebElement> rows = driver.findElements(By.name("entry"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			cachedContacts.add(new ContactData()
			.withFirstName(cells.get(2).getText())
			.withLastName(cells.get(1).getText()));
			}		
			
	}

	public ContactHelper createContact(ContactData contact) {
		manager.navigateTo().mainPage();
		initContactCreate();
	  	fillContactForm(contact, CREATION);
	  	submitContactCreation();
	    returnToContactsPage();
	    rebuildCache();
		return this;		
	}
	
	public ContactHelper modifyContact(int index, ContactData contact) {
		manager.navigateTo().mainPage();
		selectContactForEditByIndex(index);
		fillContactForm(contact, MODIFICATION);
		submitContactModification();
	    returnToContactsPage();
	    rebuildCache();
		return this;
	}
	
	public ContactHelper deleteContact(int index) {
		manager.navigateTo().mainPage();
		selectContactForEditByIndex(index);
		submitContactDeletion();
		returnToContactsPage();
		rebuildCache();
		return this;
	}
//----------------------------------------------------------------------

	public void submitContactDeletion() {
		click(By.xpath("//input[@value='Delete']"));
		cachedContacts = null;
	}
	
	public ContactHelper returnToContactsPage() {
	click(By.linkText("home page"));
	return this;
	  }

	public ContactHelper submitContactCreation() {
		click(By.name("submit"));
		cachedContacts = null;
		return this;
	  }

	public ContactHelper fillContactForm(ContactData contact, boolean formType) {
		type(By.name("firstname"),contact.getFirstName());
		type(By.name("lastname"),contact.getLastName());
		type(By.name("address"),contact.getAddress());
	    type(By.name("home"),contact.getHomePhone());
		type(By.name("mobile"),contact.getMobilePhone());
		type(By.name("work"),contact.getWorkPhone());
		type(By.name("email"),contact.getEmail());
		type(By.name("email2"),contact.getEmail2());
	    selectByText(By.name("bday"), contact.getBirthday());
	    selectByText(By.name("bmonth"), contact.getBirthmonth());
	    if (formType == CREATION){
	    //selectByText(By.name("new_group"), contact.get.contactGroup());
	    } else {
	    				if (driver.findElements(By.name("new_group")).size() != 0) {
	    					throw new Error("Group selector exists in contact modification form");
	    				}
	    			}
	    type(By.name("address2"),contact.getAddressSecond());
	   	type(By.name("phone2"),contact.getHomeSecond());
	   	return this;
	  }

	public ContactHelper initContactCreate() {
		click(By.linkText("add new"));
		return this;
		}
	
	public ContactHelper selectContactForEditByIndex(int index) {
		click(By.xpath(".//*[@id='maintable']/tbody/tr["+(index+2)+"]/td[7]/a/img"));
		return this;
	}

	public ContactHelper submitContactModification(){
		click(By.xpath("//input[@value='Update']"));
		cachedContacts = null;
		return this;		
	}

}
