package com.comparable;



public class Student implements Comparable<Student> {
	
	private Integer sId;
	private String sName;
	
	
	public Student(Integer sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	@Override
	public int compareTo(Student list2) {
		
		//this > list2 = +
		//this < list2 = -
		//  this == list2= 0
		
		if(this.getsId() > list2.getsId())
		
			return 1;
		
		else
			
			return -1;
			
		
	}
	
	
	
	

}
