package com.unit3.examples.type4;
class Employee 
{
	//variable 
	private String employeeId;
	private String employeeName;
	private double salary;
	//methods
	protected void storeData()
	{
		employeeId = "A001";
	    employeeName = "Roger";
		salary = 10000;
	}
	public void showData()
	{
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
	}
}
class Manager extends Employee
{
	private double specialAllowance;
	//method overridden in derived class
	public void storeData()
	{
		super.storeData();
		specialAllowance = 1111.11;
	}
	//error cannot be overridden to be more private,base class method is public
	protected void showData()
	{
		super.showData();
		System.out.println("Special Allowance : "+specialAllowance);
	}
	
}
class OverriddingDemo1
{
	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		manager.storeData();
	}
}
