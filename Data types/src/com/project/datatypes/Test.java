package com.project.datatypes;

public class Test {

	public static void main(String[] args) {
		

		
		/*
		 * Employee emp1 = new Employee(101, "tom", 50000);
		 * 
		 * Employee emp = new Employee();
		 * 
		 * Employee emp2 = new Employee(102,"javeed",30000);
		 * 
		 * 
		 * //System.out.println(emp1.eid +" "+ emp1.ename +" "+ emp1.salary);
		 * 
		 * 
		 * 
		 * //System.out.println(emp2.eid +" "+ emp2.ename +" "+ emp2.salary);
		 * 
		 * System.out.println(emp1.getEid() +" "+emp1.getEname() +" "+emp1.getSalary());
		 * System.out.println(emp2.getEid() +" "+emp2.getEname() +" "+emp2.getSalary());
		 * 
		 * 
		 * Employee emp3 = new Employee(0, "rahul", 0.0);
		 * 
		 * Employee emp4 = new Employee();
		 * 
		 * emp4.setEname("rahul kumar");
		 * 
		 * System.out.println(emp3);
		 * 
		 * 
		 * System.out.println(emp4);
		 */
		
		Employee emp1 = new Employee(101, "tom", 50000);
		
		System.out.println(emp1);
		Employee emp2 = new Employee(102, "ravi", 60000);
		
		System.out.println("emp2 "+emp2);
		
		System.out.println("emp1 "+emp1);

	}

	
	

	static {
		
		System.out.println("Before main static block");

	}

}
