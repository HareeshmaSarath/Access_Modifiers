package acc_package_one;

public class Checking_Inside {
	
	public static void main(String[] args) {
		
		Acc_Check ob=new Acc_Check();
		ob.check();
		System.out.println("inside package variable:"+ob.x);
		//ob.display(); not get private in other class
		ob.display1();
		ob.show();
		
	}

}