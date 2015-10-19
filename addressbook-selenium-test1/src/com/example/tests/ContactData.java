package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address;
	public String homePhone;
	public String mobilePhone;
	public String workPhone;
	public String email;
	public String email2;
	public String birthday;
	public String birthmonth;
	public String contactGroup;
	public String addressSecond;
	public String homeSecond;

	public ContactData(String firstName, String lastName, String address, String homePhone, String mobilePhone,
			String workPhone, String email, String email2, String birthday, String birthmonth, String contactGroup,
			String addressSecond, String homeSecond) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.email = email;
		this.email2 = email2;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.contactGroup = contactGroup;
		this.addressSecond = addressSecond;
		this.homeSecond = homeSecond;
	}
	public ContactData() {
		
	}
}