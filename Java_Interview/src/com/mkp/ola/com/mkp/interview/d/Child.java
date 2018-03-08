/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview.d;

public class Child extends Parent {
    @Override
    public void Overridden() {
        System.out.println("Child");
    }
    public static void main(String args[]){
        Child child = new Child();
        child.Overridden();
    }
}
