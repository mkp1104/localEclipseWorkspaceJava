package com.lara;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Human1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Human1
{

@Id
@GeneratedValue
@Column(name="H_ID")

private int id;

@Column(name="firstName")

private String firstName;

@Column(name="age")

private int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
