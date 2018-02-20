package jdbc_app1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat 
{
public static void main(String[] args) 
{

Date d1=new Date();
System.out.println(d1);
DateFormat df1=DateFormat.getDateInstance();
String s1=df1.format(d1);
System.out.println(s1);
DateFormat df2=DateFormat.getDateInstance(DateFormat.SHORT);
String s2=df2.format(d1);
System.out.println(s2);
DateFormat df3=DateFormat.getDateInstance(DateFormat.MEDIUM);
String s3=df3.format(d1);
System.out.println(s3);
DateFormat df4=DateFormat.getDateInstance(DateFormat.LONG);
String s4=df4.format(d1);
System.out.println(s4);
DateFormat df5=DateFormat.getDateInstance(DateFormat.FULL);
String s5=df5.format(d1);
System.out.println(s5);
SimpleDateFormat sd6=new SimpleDateFormat("dd/mm/yyyy");
String s6=sd6.format(d1);
System.out.println(s6);
SimpleDateFormat sd7=new SimpleDateFormat("dd/mm/yyyy 'at' HH:MM:SS");
String s7=sd7.format(d1);
System.out.println(s7);
SimpleDateFormat sd8=new SimpleDateFormat("'day :'dd,'Month: ' MM,'Year:'YYYY");
String s8=sd8.format(d1);
System.out.println(s8);

}
}
