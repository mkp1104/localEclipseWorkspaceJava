//declaring an abstract class using the keyword abstract
package com.unit3.examples.type1;
abstract class Vehicle
{
	public void start(){}
	public void stop() {}
}
class Bike extends Vehicle 
{
	public void start()
	{
		System.out.println("Start() of Bike");
	}
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
class AbstractClassDemo
{
	public static void main(String[] args)
	{
		//error cannot have a instance of abstract class
		//Vehicle v = new Vehicle();
		//a reference of abstract base class can point to any of its derived classes
		Vehicle v = new Car();
		v.start();
		v.stop();
		v = new Bike();
		v.start();
		v.stop();
	}
}
