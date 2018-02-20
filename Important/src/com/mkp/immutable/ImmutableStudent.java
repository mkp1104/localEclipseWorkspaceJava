package com.mkp.immutable;

//An immutable class, all the wrapper classes (like String, Boolean, Byte, Short) and String class is immutable.
/*Following are the requirements:
• Class must be declared as final (So that child classes can’t be created)
• Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
• A parameterized constructor
• Getter method for all the variables in it
• No setters(To not have option to change the value of the instance variable)*/

public class ImmutableStudent // call TryModifyImmutableStudent class
//public final class ImmutableStudent
{
 final String name;
 final int regNo;

 public ImmutableStudent(String name, int regNo)
 {
     this.name = name;
     this.regNo = regNo;
 }
 public String getName()
 {
     return name;
 }
 public int getRegNo()
 {
     return regNo;
 }
}

