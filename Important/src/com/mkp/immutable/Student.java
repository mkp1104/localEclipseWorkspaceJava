/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.immutable;

public class Student {
    public int studenId;
    public String studentName;
    public int age;

    public void setStudenId(int studenId) {
        this.studenId = studenId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudenId() {
        return studenId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }
}
