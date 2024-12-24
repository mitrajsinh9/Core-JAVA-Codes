package jDemo8Abs;

abstract class polygon
{

	abstract void area(int h,int b);
}

class triangle extends polygon
{
	
	@Override
	void area(int h, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle = " + (0.5*b*h));
	}
	
}

class rectangle extends polygon
{

	@Override
	void area(int h, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle = " + (b*h));
	}
	
}

public class j2abspolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle t1=new triangle();
		t1.area(10,20);
		
		rectangle r1=new rectangle();
		r1.area(10,30);
		
	}

}
