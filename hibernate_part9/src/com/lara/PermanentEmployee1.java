package com.lara;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Table;

@Entity
@Table(name="PermanentEmployee1")
@AttributeOverrides({
		
		@AttributeOverride(name="id",column=@Column(name="id")),
		@AttributeOverride(name="firstName",column=@Column(name="firstName")),
		@AttributeOverride(name="age",column=@Column(name="age")),
		@AttributeOverride(name="address",column=@Column(name="address")),
		@AttributeOverride(name="city",column=@Column(name="city")),
		@AttributeOverride(name="designation",column=@Column(name="designation")),
		@AttributeOverride(name="email",column=@Column(name="email"))
	
})


public class PermanentEmployee1 extends Employee1
{
	@Column(name="salary")
	
	private double salary;
	
	@Column(name="leaveCoount")
	
	private int  leaveCount;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}
	
}
