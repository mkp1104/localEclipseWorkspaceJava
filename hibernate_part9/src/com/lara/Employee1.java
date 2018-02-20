package com.lara;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.AttributeOverride;

@Entity
@Table(name="Employee1")
@AttributeOverrides({
	
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="firstName",column=@Column(name="firstName")),
	@AttributeOverride(name="age",column=@Column(name="age")),
	@AttributeOverride(name="address",column=@Column(name="address")),
	@AttributeOverride(name="city",column=@Column(name="city"))
})

public class Employee1 extends Person1
{
	@Column(name="destinastion")
	
	private String designation;
	
	@Column(name="email")
	
	private String email;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
