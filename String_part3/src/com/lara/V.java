package com.lara;

public class V
{

	public static void main(String[] args) {
		
	
R1.find("dadadefrgeree","[abe]");
System.out.println("---");
R1.find("sfsgdgioosdgdsgdsg","[ef]");	
R1.find("sfsgdgioosdgdsgdsg","[e-i]");	
R1.find("sfsgdgioosdgdsg123134353234432dsg","[2-4]");
R1.find("sfsgdgioosdgdsg123134353234432dsg","[26]");	
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","\\d");	
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","\\d+");	
R1.find("sf g1 dg 132o gds% 2sdsd23 43 dsg","\\s");	
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","\\D");
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","[a-z][1-9]");
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","g[146]");
R1.find("sfsg13dgio%132osdgds%g12sdsd234432dsg","[a-ep-x1-4]");
R1.find("s ","\\w");
R1.find("s1","\\w");
R1.find("s1%@3","\\w");
R1.find("p2 a4 t5 x7","[a-p][2-8]");
	
}    
}
