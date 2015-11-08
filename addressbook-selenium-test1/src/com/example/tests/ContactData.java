package com.example.tests;

public class ContactData implements Comparable<ContactData> {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	//	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	//	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContactData [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
		
	@Override
	public int compareTo(ContactData other) {
		int res = this.lastName.compareTo(other.lastName);
		if (res!=0){			
		return res;
		}
		return this.firstName.compareTo(other.firstName);
	}
	
	}
	
	
