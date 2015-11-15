package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	private String firstName;
	private String lastName;
	private String address;
	private String homePhone;
	private String mobilePhone;
	private String workPhone;
	private String email;
	private String email2;
	private String birthday;
	private String birthmonth;
	private String contactGroup;
	private String addressSecond;
	private String homeSecond;

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
	public ContactData withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public ContactData withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public ContactData withAddress(String address) {
		this.address = address;
		return this;
	}
	public ContactData withHomePhone(String homePhone) {
		this.homePhone = homePhone;
		return this;
	}
	public ContactData withMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
		return this;
	}
	public ContactData withWorkPhonee(String workPhone) {
		this.workPhone = workPhone;
		return this;
	}
	public ContactData withEmail(String email) {
		this.email = email;
		return this;
	}
	public ContactData withEmail2(String email2) {
		this.email2 = email2;
		return this;
	}
	public ContactData withBirthday(String birthday) {
		this.birthday = birthday;
		return this;
	}
	public ContactData withBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
		return this;
	}
	public ContactData withContactGroup(String contactGroup) {
		this.contactGroup = contactGroup;
		return this;
	}
	public ContactData withAddressSecond(String addressSecond) {
		this.addressSecond = addressSecond;
		return this;
	}
	public ContactData withHomeSecond(String homeSecond) {
		this.homeSecond = homeSecond;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public String getEmail() {
		return email;
	}
	public String getEmail2() {
		return email2;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getBirthmonth() {
		return birthmonth;
	}
	public String getContactGroup() {
		return contactGroup;
	}
	public String getAddressSecond() {
		return addressSecond;
	}
	public String getHomeSecond() {
		return homeSecond;
	}
	
	

}
	
	
