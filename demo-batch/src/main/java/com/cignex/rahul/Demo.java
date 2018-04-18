package com.cignex.rahul;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<User>();
		
		list.add(new User(5, "rahul1"));
		list.add(new User(3, "rahul1"));
		list.add(new User(7, "rahul1"));
		
		Collections.sort(list);
		System.out.println(list);

	}
}

