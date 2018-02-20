package com.lara;

public class Address
{
private String StreetName;
private String CityName;
private int Pincode;
Address()
{
System.out.println("Address-Constr");	
}
public String getStreetName() {	return StreetName;
}
public void setStreetName(String streetName) {

	System.out.println("StreetName");

	StreetName = streetName;
}
public String getCityName() {
	return CityName;
}
public void setCityName(String cityName) {

	System.out.println("CityName");

	CityName = cityName;
}
public int getPincode() {
	return Pincode;
}
public void setPincode(int pincode) {

	System.out.println("Pincode");

	Pincode = pincode;
}
}
