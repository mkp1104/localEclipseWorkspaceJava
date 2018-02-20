package com.unit4.examples.type;
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
}

class AbstractClassDemo
{
	public static void main(String[] args)
	{
		//Number num = new Number();
		Integer i = new Integer(6098);
		Decimal d = new Decimal(456.89);

		System.out.println("Integer Value : " + i.getWhole());
		System.out.println("Decimal Value : " + (d.getWhole() + d.getDecimal()));
	}
}