/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview.logical;

import java.util.Scanner;

public class SwapNumberWithoutTempVariable {
    public static void main(String args[]) {
        System.out.println("Please Enter 1st Number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
