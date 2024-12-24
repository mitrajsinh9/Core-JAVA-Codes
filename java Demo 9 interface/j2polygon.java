package jDemo9Interface;

interface polygon
{
	public void area(int h,int b);

}


class triangle implements polygon{

	@Override
	public void area(int h, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of trianlge =" + (0.5*b*h));
	}
}

class rectangle implements polygon{

	@Override
	public void area(int h, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle =" + (b*h));
	}
	
	
}
public class j2polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle t1=new triangle();
		t1.area(10, 20);
		
		rectangle r1=new rectangle();
		r1.area(10, 20);
	

	}

}
