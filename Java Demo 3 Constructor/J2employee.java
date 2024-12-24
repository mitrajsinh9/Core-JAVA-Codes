package jDemo3Constructor;

class emp
{
	int eno;
	String ename;
	int esalary;//Data members
	
	emp() //without argument , deffault
	{
		eno=5;
		ename="ram";
		esalary=22;
	}
	
	emp(int x,String y,int a) //with argument , parameterized
	{
		eno=x;
		ename=y;
		esalary=a;
	}
	
	
	void printData()
	{
		System.out.println("Emp no. = " + eno + "  Emp name = " + ename + "  Emp salary = "+ esalary );
	}
	
}

public class J2employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp e1=new emp();
		emp e2=new emp();
		emp e3=new emp(101,"raghav",33000);
		
		e1.printData();
		e2.printData();
		e3.printData();

	}

}
