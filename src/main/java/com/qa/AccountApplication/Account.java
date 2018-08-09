package com.qa.AccountApplication;


public class Account {
	
	private String firstname;
	private String lastname;
	private String accountnumber;
	
	public Account(String firstname, String lastname, String accountnumber) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber = accountnumber;
	}
		
	@Override
	public String toString() {
		return "Account [firstname=" + firstname + ", lastname=" + lastname + ", accountnumber=" + accountnumber + "]";
	
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}


	
	

}
