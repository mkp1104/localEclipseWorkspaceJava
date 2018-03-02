package com.mkp.immutable;

public class TryModifyImmutableStudent extends ImmutableStudent{

//	private static String name;
//	private static int regNo;
	private  String nameNew;
	private  int regNoNew;
//	public TryModifyImmutableStudent(){
////		super(this.name, regNo);
////		super(name, regNo);
//	}
	
	public TryModifyImmutableStudent(String name, int regNo) {
		
//		this();
		
		super(name,regNo);
		nameNew = name;
		regNoNew = regNo;
		// TODO Auto-generated constructor stub
	}
//	public void setName(String name){
////		super(name, regNo);
//		this.name = name;
//	}
	public void setName(String nameNew){
		this.nameNew = nameNew;
	}
	public void setRegNo(int regNoNew){
		this.regNoNew = regNoNew;
	}
	 public String getName()
	 {
	     return nameNew;
	 }
	 public int getRegNo()
	 {
	     return regNoNew;
	 }
	
	public static void main(String[] args) {
		
		TryModifyImmutableStudent tmis = new TryModifyImmutableStudent("mkp", 101);
//		Short
		ImmutableStudent  is = (ImmutableStudent)tmis;
//		ImmutableStudent  is = new TryModifyImmutableStudent("mkp", 101);
		
		ImmutableStudent  isN = new ImmutableStudent("immutable",001);
		System.out.println(is.getName());
		System.out.println(is.getRegNo());
//		System.out.println(isN.getName());
//		System.out.println(isN.getRegNo());
//		isN.name = "mutable";
//		isN.regNo = 008;
		tmis.setName("djtt");
		tmis.setRegNo(57588);
//		isN.setName("djtt");
//		isN.setRegNo(57588);
//		is.setName("djtt");
//		is.setRegNo(57588);
		System.out.println(is.getName());
		System.out.println(is.getRegNo());
//		this.tmis = tmis;
		
//		tmis.name = "jc";
//		tmis.regNo = 344;
//		tmis.name = "jhdh";
//		tmis.regNo = 344776;
//		System.out.println(name);
		
		
		
//		System.out.println(tmis.getRegNo());

		Student studentA = new Student();
		studentA.setStudenId(123);
		studentA.setAge(15);
		studentA.setStudentName("mkp");
		ImmutableStudent imstudent = new ImmutableStudent("std1",876,studentA);
		System.out.println(imstudent.getName()+" :imstudent.getName(),"+imstudent.getName()+" :imstudent.getName(),"+imstudent.getStudent().getStudenId()+" :imstudent.getStudent().getStudenId(),"+imstudent.getStudent().getStudentName()+" :imstudent.getStudent().getStudentName(),"+imstudent.getStudent().getAge()+" :imstudent.getStudent().getAge()");
		studentA.setStudenId(1234);
		studentA.setAge(156);
		studentA.setStudentName("Manish Kr Prasad ");
		System.out.println(imstudent.getName()+" :imstudent.getName(),"+imstudent.getName()+" :imstudent.getName(),"+imstudent.getStudent().getStudenId()+" :imstudent.getStudent().getStudenId(),"+imstudent.getStudent().getStudentName()+" :imstudent.getStudent().getStudentName(),"+imstudent.getStudent().getAge()+" :imstudent.getStudent().getAge()");
	}

}
