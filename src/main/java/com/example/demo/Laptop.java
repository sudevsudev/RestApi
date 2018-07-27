package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int Lid;
	private String lname;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void laptop()
	{
		System.out.println("laptop method is running");
	}
}
