/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview;

public class HashcodeEquals {
    public static void main(String ergs[]) {
        String str1 = "abc";
        String str2 = "xyz";
        String str3 = new String("abc");
        String str4 = "abc";
        HashcodeEquals hce1 = new HashcodeEquals();
        HashcodeEquals hce2 = new HashcodeEquals();
        System.out.println("str1 == str2 " + str1 == str2);//F
        System.out.println("str1 == str3 " + str1 == str3);//F
        System.out.println("str1 == str4 " + str1 == str4);//T
        System.out.println("str1.equals(str4) " + str1.equals(str4));//T

        System.out.println("hce1==hce2 " + (hce1 == hce2));//false
        System.out.println("hce1.equals(hce2) " + hce1.equals(hce2));//false
        System.out.println("str1.equals(str3) " + str1.equals(str3));//T because equals() overridden in String class.

        System.out.println("str1.equals(str2) " + str1.equals(str2));//F
        System.out.println("str1.hashCode() " + str1.hashCode());//@str1
        System.out.println("str2.hashCode() " + str2.hashCode());//@str2
        System.out.println("str3.hashCode() " + str3.hashCode());//@str1
        System.out.println("str4.hashCode() " + str4.hashCode());//@str1
    }
}
