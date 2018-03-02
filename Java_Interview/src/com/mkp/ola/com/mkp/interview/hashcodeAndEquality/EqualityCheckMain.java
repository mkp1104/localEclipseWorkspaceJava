/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview.hashcodeAndEquality;

public class EqualityCheckMain {

    /**
     * @author arpit mandliya
     */
    public static void main(String[] args) {

        Country india1=new Country();
        india1.setName("India");
        Country india2=new Country();
        india2.setName("India");
        System.out.println("Is india1 is equal to india2:" + (india1==india2));//false //uncomment if equals() overridden in Country class.
        System.out.println("Is india1 is equal to india2:" +  india1.equals(india2));//false by default india1.equals(india2) uses (india1==india2).//uncomment if equals() is not overridden in Country class.
//          System.out.println("Is india1 is equal to india2:" + (india1==india2));//false //uncomment if equals() overridden in Country class.
//          System.out.println("Is india1 is equal to india2:" +  india1.equals(india2));//true by default india1.equals(india2) uses (india1==india2).//uncomment if equals() is not overridden in Country class.

    }

}
