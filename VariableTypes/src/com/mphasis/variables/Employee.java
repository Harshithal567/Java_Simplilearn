package com.mphasis.variables;

public class Employee {

     static int eid;
	static String ename;  //Data Hidings
	 static double salary;
	
	
	public Employee() {
		
		
	}
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		
		return this.eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
