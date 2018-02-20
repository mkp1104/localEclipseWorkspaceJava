package com.lara.printName.from.staffClass;

public class StaffPublic {
	private String name;
    private int age;
    private String extra;
    
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public String getExtra (){
    	return extra;
    }
    public void setAge(int age){
    this.age = age;
    }    
    public void setName(String name){
    this.name = name;
    }    
    public void setExtra(String extra){
    this.extra = extra;
    }    
}
