package com.hsammap;

import java.util.HashMap;
import java.util.Map;

import javax.naming.ldap.HasControls;

public class Test {

	public static void main(String[] args) {
		
		HashMap<Employee,String> hm = new HashMap<Employee,String>();  
		
		Employee emp1 = new Employee(101, "imran", "mumbai");
		//Employee emp2 = new Employee(102, "imran", "mumbai");
		//StringTest st1 = new StringTest("imran");
		//StringTest st2 = new StringTest("imran");
		
		//hm.put(st1, "123");
		//hm.put(st2, "123");
		//emp1.setName("abc");
		hm.put(emp1, "123");
		emp1.setName("abc");
			System.out.println("key");
		System.out.println(hm.get(emp1));
		System.out.println(hm.size());
			

	}

}
