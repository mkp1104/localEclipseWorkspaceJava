//declaring an abstract class using the keyword abstract
package com.unit3.examples;
abstract class Vehicle
{
	//declaring the methods as abstract
	abstract public void start();
	abstract public void stop();
}
class Bike extends Vehicle 
{
	//compiation error if start is not implemented since start() is abstract in base class
	
	public void stop()
	{
		System.out.println("Stop() of Bike");
	}
}
class Car extends Vehicle 
{
	public void start()
	{
		System.out.println("Start() of Car");
	}
	public void stop()
	{
		System.out.println("Stop() of Car");
	}
}
class Bus extends Vehicle 
{
	public void start()
	{
		System.out.println("Start() of Bus");
	}
	public void stop()
	{
		System.out.println("Stop() of Bus");
	}
}
class AbstractMethodDemo
{
	public static void main(String[] args)
	{
		//error cannot have a instance of abstract class
		//Vehicle v = new Vehicle();
		//a reference of abstract base class can point to any of its derived classes
		Vehicle v = new Car();
		v.start();
		v.stop();
	}
}
