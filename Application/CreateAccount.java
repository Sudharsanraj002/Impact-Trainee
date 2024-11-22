package com.aspiresys;

public class CreateAccount {
	private String Name ;
	private String pw;

	CreateAccount(String name,String pass)
	{
		this.Name=name;
		this.pw=pass;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}