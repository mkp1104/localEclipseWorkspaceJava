package com.unit3.examples.type3;
class Employee 
{
	//variable 
	private String employeeId = "A001";
	private String employeeName = "Roger";
	private double salary = 10000;
	//methods
	public void showDetails()
	{
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
	}
}
class Manager extends Employee
{
	private double specialAllowance = 1111.11;
	//method overridden in derived class
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Special Allowance : "+specialAllowance);
	}
	
}
class OverriddingDemo1
{
	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		manager.showDetails();
	}
}
