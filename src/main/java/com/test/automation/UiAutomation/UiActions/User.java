package com.test.automation.UiAutomation.UiActions;

public class User {
	
	private String emailadd;
	private String firstname1;
	private String lname1;
	private String Passwd1;
	private String Address1;
	private String city1;
	private String id_state;
	private String zip1;
	private String phone1;
	private String alias1;
	
	
	
	
	
	public String getEmailadd() {
		return emailadd;
	}





	public void setEmailadd(String emailadd) {
		this.emailadd = emailadd;
	}





	public String getFirstname1() {
		return firstname1;
	}





	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}





	public String getLname1() {
		return lname1;
	}





	public void setLname1(String lname1) {
		this.lname1 = lname1;
	}





	public String getPasswd1() {
		return Passwd1;
	}





	public void setPasswd1(String passwd1) {
		Passwd1 = passwd1;
	}





	public String getAddress1() {
		return Address1;
	}





	public void setAddress1(String address1) {
		Address1 = address1;
	}





	public String getCity1() {
		return city1;
	}





	public void setCity1(String city1) {
		this.city1 = city1;
	}





	public String getId_state() {
		return id_state;
	}





	public void setId_state(String id_state) {
		this.id_state = id_state;
	}





	public String getZip1() {
		return zip1;
	}





	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}





	public String getPhone1() {
		return phone1;
	}





	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}





	public String getAlias1() {
		return alias1;
	}





	public void setAlias1(String alias1) {
		this.alias1 = alias1;
	}





	public static User getUser() {
		User user_ref = new User();
		//user.setFirstname1();
		return user_ref;
	}
	
	

}
