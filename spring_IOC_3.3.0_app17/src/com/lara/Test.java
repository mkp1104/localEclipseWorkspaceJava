package com.lara;
import org.springframework.beans.factory.annotation.Required;
public class Test 
{
private String parm1;

public String getParm1() {
	return parm1;
}
@Required
public void setParm1(String parm1) {
	this.parm1 = parm1;
}


}
