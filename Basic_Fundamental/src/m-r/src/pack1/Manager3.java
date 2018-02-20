package pack1;
class  Job
{
	String title;
	double salary;
	Job(String title,double salary)
	{
	this.title=title;
	this.salary=salary;
	}
}
class Employee
{
private int index;
Job x[];
	Employee(Job x[])
	{
	this.x=x;
	}
	Job nextJob()
	{
	return x[index++];
	}
}
class Manager3
{

	public static void main(String[] args) 
	{
		Job j1=new Job("Software",50000.9);
		Job j2=new Job("Hardware",10000.9);
		Job j3=new Job("Hr",500.9);
		Job x[]={j1,j2,j3};
		Employee emp=new Employee(x);
		print(emp);
		
		System.out.println("-----------------");
		print(emp);
		
		System.out.println("----------");
		print(emp);
		System.out.println("------");
		print(emp);
		System.out.println("---");
	}
	private static void print(Employee emp)
	{
	
	Job j1=null;
	int y=x.length;
	if(y<=3)
		{
			j1=emp.nextJob();
			
		System.out.println(j1.title+","+j1.salary);
		}
		System.exit(0);
	}
}