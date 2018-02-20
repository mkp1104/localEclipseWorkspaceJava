package com.lara;
import java.sql.SQLException;
import java.io.FileReader;
import java.util.Properties;
import java.sql.Statement;
import java.util.Set;				
public class J
{
public static void main(String args[]) throws Exception
{
Statement st=EUtil.getStatement();
Properties pr=new Properties();
FileReader fin=new FileReader("test2.properties");
pr.load(fin);
Set <String> keys=pr.stringPropertyNames();
String value;
for(String key:keys)
{
value=pr.getProperty(key);
st.execute(value);
}
System.out.println("Thanks for Visit,Come Again!!!!");

}
}