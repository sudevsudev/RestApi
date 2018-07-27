package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String sname;
	private String room;
	@Autowired
	Laptop laptop;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", room=" + room + "]";
	}
	
	public void Done() {
		System.out.println("yes object created");
		laptop.laptop();
	}
	

}
