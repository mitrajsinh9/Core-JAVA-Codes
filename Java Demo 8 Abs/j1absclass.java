package jDemo8Abs;


abstract class dadagiri
{
	abstract void nasto();
	abstract void add(int a,int b);
}

class mitraj extends dadagiri
{

	@Override
	void nasto() {
		// TODO Auto-generated method stub
		System.out.println("Mitraj nasto");
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mitraj Add = " + (a+b));
	}
	
}

class jay extends dadagiri{

	@Override
	void nasto() {
		// TODO Auto-generated method stub
		System.out.println("jay nasto");
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("jay Add = " + (a+b));
	}
	
}




public class j1absclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mitraj m1=new mitraj();
		m1.add(22, 33);
		m1.nasto();
		
		jay j1=new jay();
		j1.add(30, 20);
		j1.nasto();
	}

}
