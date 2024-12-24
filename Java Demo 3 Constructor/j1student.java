package jDemo3Constructor;


class student
{
	int rno;
	String name;
	int engmarks; //Data members
	int hinmarks;
	
	student() //without argument , deffault
	{
		rno=5;
		name="ram";
		engmarks=22;
		hinmarks=33;
	}
	
	student(int x,String y,int a,int b) //with argument , parameterized
	{
		rno=x;
		name=y;
		engmarks=a;
		hinmarks=b;
	}
	
	
	void printData()
	{
		System.out.println("Roll no. = " + rno + "  Sname = " + name + "  English marks = "+ engmarks + "  Hindi marks = " + hinmarks);
	}
	
}


public class j1student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		student s1=new student();
		student s2=new student();
		student s3=new student(101,"raghav",33,44);
		student s4=new student(102,"mansi",44,55);
		
		s1.printData();
		s2.printData();
		s3.printData();
		s4.printData();
		
	}

}
