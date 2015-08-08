package com.exoSpringSample.model;

public class Contact {

	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	private String title;
	private String postFix;
	private long contactId;
	
	public Contact(String firstName, String lastName, String middleName, String email, String phone, String title, String postFix, long contactId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phone = phone;
		this.title = title;
		this.postFix = postFix;
		this.contactId = contactId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPostFix() {
		return postFix;
	}

	public void setPostFix(String postFix) {
		this.postFix = postFix;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
