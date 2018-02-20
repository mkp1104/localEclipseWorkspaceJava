package com.lara.printName.from.staffClass;

import java.math.BigDecimal;

public class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
    Staff(String name, int age, BigDecimal salary){
    	this.name = name;
    	this.age = age;
    	this.salary = salary;
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public BigDecimal getSalary(){
    	return salary;
    }
    }
