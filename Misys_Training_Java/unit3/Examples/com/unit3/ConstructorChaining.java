package com.unit3;
class Employee 
{
	//variable 
	private String employeeId;
	private String employeeName;
	//overloaded constructors
	public Employee()
	{
		System.out.println("Default constructor of Employee");
	}
	public Employee(String id , String name)
	{
		System.out.println("Parameterised constructor of Employee");
	}
}
class Manager extends Employee
{
	private double specialAllowance;
	//constructor
	Manager()
	{
		this("A001","Roger");
		System.out.println("Default constructor of Manager");
	}
	Manager(String id , String name)
	{
		super(id,name);
		System.out.println("Parameterised constructor of Manager");
	}	
}
class  ConstructorChaining
{
	public static void main(String[] args) 
	{
		new Manager();
		new Manager("A001","Roger");
	}
}
