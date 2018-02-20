package com.unit4.examples;
abstract class Number 
{
	private long wholePart;
	private double decimalPart;

	protected void setWhole(long l)
	{
		this.wholePart = l;
	}

	protected void setDecimal(double d)
	{
		this.decimalPart = d;
	}
	protected long getWhole()
	{
		return wholePart;
	}

	protected double getDecimal()
	{
		return decimalPart;
	}

	public abstract void printNumber();
}

class Integer extends Number
{
	private long maxValue;
	private long minValue;

	Integer()
	{ 
		setWhole(0);
	}

	Integer(int i)
	{
		setWhole(i);
	}

	public void printNumber()
	{
		System.out.println("Value of integer number is : " + getWhole());
	}
}

class Decimal extends Number
{
	private long maxWhole;
	private long minWhole;
	private long maxDecimalDigits;

	Decimal()
	{ 
		setWhole(0);
		setDecimal(0);
	}

	Decimal(double d)
	{
		long l = (long)d;
		double dub = d-l;
		setWhole(l);
		setDecimal(dub);
	}
	public void printNumber()
	{
		System.out.println("Value of decimal number : " + (getWhole()+getDecimal()));
	}
}

class AbstractMethodDemo
{
	public static void main(String[] args)
	{
		Integer i = new Integer(6098);
		Decimal d = new Decimal(456.89);

		i.printNumber();
		d.printNumber();
	}
}