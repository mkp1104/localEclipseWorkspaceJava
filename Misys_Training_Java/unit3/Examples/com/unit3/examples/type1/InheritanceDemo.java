package com.unit3.examples.type1;
class Employee 
{
	//variable 
	private String employeeId;
	private String employeeName;
	private double salary;
	//methods
	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	private double specialAllowance;

	public void setSpecialAllowance(double specialAllowance)
	{
		this.specialAllowance = specialAllowance;
	}
	public double getSpecialAllowance()
	{
		return specialAllowance;
	}
}
class InheritanceDemo
{
	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		manager.setEmployeeId("A001");
		manager.setEmployeeName("Roger");
		manager.setSpecialAllowance(10000);
		System.out.println("Employee Id :"+manager.getEmployeeId());
		System.out.println("Employee Name :"+manager.getEmployeeName());
		System.out.println("Special Allowance :"+manager.getSpecialAllowance());
	}
}
