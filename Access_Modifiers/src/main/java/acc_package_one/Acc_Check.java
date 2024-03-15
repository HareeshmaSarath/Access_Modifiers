package acc_package_one;

public class Acc_Check {
	
	public int x=12;
	private int m=12;
	
	private void display()
	{
		System.out.println("private");
	}
	
	void display1()
	{
		System.out.println("Default");
	}
	
	protected void show()
	{
		System.out.println("protected");
	}
	
	public void check()
	{
		if(x>10)
		{
			System.out.println("number is greater than 10");
		}
		else
		{
			System.out.println("number is less than 10");
		}
	}
	
	public static void main(String[] args) {
		
		Acc_Check ob=new Acc_Check();
		ob.check();
		System.out.println("variable:"+ob.x);
		ob.display();
		System.out.println("Private:"+ob.m);
		ob.display1();
		ob.show();
		
	}

}