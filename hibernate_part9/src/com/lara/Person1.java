package com.lara;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
@Entity
@Table(name="Person1")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="firstName",column=@Column(name="firstName")),
	@AttributeOverride(name="age",column=@Column(name="age"))
	
})

public class Person1 extends Human1
{
	
@Column(name="address")	

private String address;

@Column(name="city")

private String city;

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
