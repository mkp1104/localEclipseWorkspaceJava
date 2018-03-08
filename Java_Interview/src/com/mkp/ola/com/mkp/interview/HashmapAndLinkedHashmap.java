/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashmapAndLinkedHashmap {
public static void main(String args[]){
    HashMap hm = new HashMap();
    hm.put("key1","abcd");
    hm.put("key2","xyz");
    hm.put("key3","ABCD");
    hm.put("key4","XYZ");
    hm.put("key5","abcd");
    hm.put("key6","xyz");
    hm.put("key7","ABCD");
    hm.put("key8","XYZ");
//    foreach(Entity obj : hm.entrySet()){
//        System.out.println(obj.ge);
//    }
    System.out.println(hm);//key, values will be printed in random order.

    LinkedHashMap lhm = new LinkedHashMap();
    lhm.put("key1","abcd");
    lhm.put("key2","xyz");
    lhm.put("key3","ABCD");
    lhm.put("key4","XYZ");
    System.out.println(lhm);//key, values will be printed in order.
}
}
