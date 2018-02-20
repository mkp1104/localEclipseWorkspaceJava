package com.lara;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class Employee
{
	private String Name;
	private int Age;
	private Double Weight;
	private Address PermanentAddress;
	private Set Mobile_no;
	private Map Educations;
	private List Mails;
	private Properties Projects;
Employee(String Name,int Age,Double Weight,Address PermanentAddress,Set Mobile_no,Map Educations,List Mails,Properties Projects)
{
	this.Name=Name;
	this.Age=Age;
	this.Weight=Weight;
	this.PermanentAddress=PermanentAddress;
	this.Mobile_no=Mobile_no;
	this.Educations=Educations;
	this.Mails=Mails;
	this.Projects=Projects;
	
}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public Double getWeight() {
		return Weight;
	}
	public Address getPermanentAddress() {
		return PermanentAddress;
	}
	public Set getMobile_no() {
		return Mobile_no;
	}
	public Map getEducations() {
		return Educations;
	}
	public List getMails() {
		return Mails;
	}
	public Properties getProjects() {
		return Projects;
	}
	
}