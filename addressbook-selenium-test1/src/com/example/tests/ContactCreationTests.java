package com.example.tests;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import com.example.utils.SortedListOf;
import static com.example.fw.ContactHelper.CREATION;

public class ContactCreationTests extends TestBase {
  @Test(dataProvider = "randomValidContactGenerator")
  public void testContactCreationWithValidData(ContactData contact) throws Exception {
    //save old state
	  	SortedListOf<ContactData> oldList = app.getContactHelper().getContacts();
  	//action
  	app.getContactHelper().createContact(contact);
  	//save new state
  		SortedListOf<ContactData> newList= app.getContactHelper().getContacts();
  	
  	//compare state
  	  assertThat(newList, equalTo(oldList.withAdded(contact)));
 }
  
 
}
