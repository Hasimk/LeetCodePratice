package com.hsammap;

public class Employee {
	private int id;
	private String name;
	private String add;
	
	
	public Employee(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	
	
	

}
