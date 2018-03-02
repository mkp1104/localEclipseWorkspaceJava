/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview.hashcodeAndEquality;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEqualityCheckMain {

    /**
     * @author Arpit Mandliya
     */
    public static void main(String[] args) {
        HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
        Country india1 = new Country();
        india1.setName("India");
        Country india2 = new Country();
        india2.setName("India");

        countryCapitalMap.put(india1, "Delhi");
        countryCapitalMap.put(india2, "Delhi");

        Iterator countryCapitalIter = countryCapitalMap.keySet().iterator();
        while (countryCapitalIter.hasNext()) {
            Country countryObj = (Country) countryCapitalIter.next();
            String capital = countryCapitalMap.get(countryObj);
            System.out.println("Capital of " + countryObj.getName() + "----" + capital);

        }
    }
}
