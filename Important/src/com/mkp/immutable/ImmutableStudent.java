package com.mkp.immutable;

//An immutable class, all the wrapper classes (like String, Boolean, Byte, Short) and String class is immutable.
/*Following are the requirements:
? Class must be declared as final (So that child classes can?t be created)
? Data members in the class must be declared as final (So that we can?t change the value of it after object creation)
? A parameterized constructor
? Getter method for all the variables in it
? No setters(To not have option to change the value of the instance variable)*/

public class ImmutableStudent // call TryModifyImmutableStudent class
//public final class ImmutableStudent
{
    final String name;
    final int regNo;
    final Student student;// you must have to initialize student.

    public ImmutableStudent(String name, int regNo, Student student) {
        this.name = name;
        this.regNo = regNo;
        this.student = student;
    }

//    public ImmutableStudent(String name, int regNo) {
//        this.name = name;
//        this.regNo = regNo;
//    }

    public Student getStudent() {
        return student;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }
}

