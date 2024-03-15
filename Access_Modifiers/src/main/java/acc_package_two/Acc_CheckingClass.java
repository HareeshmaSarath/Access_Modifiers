package acc_package_two;

import acc_package_one.Acc_Check;

public class Acc_CheckingClass extends Acc_Check{
	
	public static void main(String[] args) {
		
		Acc_Check ob=new Acc_Check();
		System.out.println("Number:"+ob.x);
		ob.check();
		//ob.display(); -- not get private
		//ob.display1(); -- not get default/not get through subclass also
		Acc_CheckingClass o=new Acc_CheckingClass();
		o.show(); //outside package subclass through can get when using protected
		
	}

}