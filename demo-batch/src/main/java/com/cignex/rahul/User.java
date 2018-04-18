package com.cignex.rahul;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Comparable<User>, Serializable{

	int id;
	String name;

	public User() {

	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(User o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
