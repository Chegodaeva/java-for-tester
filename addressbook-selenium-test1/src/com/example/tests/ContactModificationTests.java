package com.example.tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Random;
import org.testng.annotations.Test;
import com.example.utils.SortedListOf;
import static com.example.fw.ContactHelper.MODIFICATION;

public class ContactModificationTests extends TestBase {
	
	@Test(dataProvider = "randomValidContactGenerator")
	public void modifySomeContact(ContactData contact){
		//save old state
		SortedListOf<ContactData> oldList = app.getContactHelper().getContacts();
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size());
		if(index>0){
		index = index - 1;}
		//actions	
		app.getContactHelper().modifyContact(index, contact);
		//save new state
		SortedListOf<ContactData> newList= app.getContactHelper().getContacts();
		//compare state
		assertThat(newList, equalTo(oldList.without(index).withAdded(contact)));
	}

}
