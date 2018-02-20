package com;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
public class Person 
{
private int id;
private Timestamp doj;
private Date dob;
private Blob photo;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Timestamp getDoj() {
	return doj;
}
public void setDoj(Timestamp doj) {
	this.doj = doj;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Blob getPhoto() {
	return photo;
}
public void setPhoto(Blob photo) {
	this.photo = photo;
}

}
