package com.unit3.examples.type2;
class Employee 
{
	private String employeeId;
	private String employeeName;	
}
class Manager extends Employee
{
	private double specialAllowance;
}
class ObjectCastingDemo
{
	public static void main(String[] args) 
	{
		Employee emp = new Manager(); // implicit cast 
		Employee emp1 = new Employee();
		Manager mgr = new Manager();
		mgr = (Manager) emp1; // explicit casting
	//	mgr = emp1; // error
		
	}
}
