/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview;

import java.util.ArrayList;
import java.util.List;

class WildcardDemo 
{
	public static void printNumbers(List<? extends Number> list)
	{
		for(Object o : list)
			System.out.println(o);
//		list.add(123); // compilation error
	}
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		printNumbers(list);
		List<Double> doubleList = new ArrayList<Double>(); 
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);
		doubleList.add(4.4);
		doubleList.add(5.5);
		printNumbers(doubleList);
	}
}
