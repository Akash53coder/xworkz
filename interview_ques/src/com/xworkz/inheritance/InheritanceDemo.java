package com.xworkz.inheritance;

//1) Private methods are final.
//2) Protected members are accessible within a package and inherited classes outside the package.
//3) We cannot override private methods.
//4) private methods and properties will not be inherited to sub class.
class Base{
	public void m1() {
		System.out.println("m1 in base");
	}
	
	//if the method is private, we can't override it in Derived class.
	
	private void m2() {
		System.out.println("m2 in Base");
	}
	
	public final void show() {
		System.out.println("m1 in base");
	}
	
}

class Derived extends Base{
	
	@Override
	public void m1() {
		System.out.println("m1 in Derived");
	}
	
//	@Override - Error, this method acts as a separate method in Derived class
//  make this public, otherwise this method cannot accessed by other classes
	public void m2() {
		System.out.println("m2 in Derived");
	}
	
// Error	
// no way I can override a method which is final in Base class
//	public void show() {
//		System.out.println("show in Derived class");
//	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
//		Base b = new Base();
//		b.m1();
//		
//		Base b1 = new Derived();
//		b1.m1();
//		
//		Derived d = new Derived();
//		d.m1();
//		
//		Derived d1 = (Derived) new Base();
//		d1.m1();
		
//		Derived d = new Derived();
//		d.m2();
		
		//m2 method is not visible for Base
//		Base b1 = new Derived();
//		b1.m2();
		
		//CCE, if we perform down-casting with this approach
//		Derived d1 =  (Derived) new Base();
//		d1.m1();
		
		//DownCasting
		Base b = new Derived();
		Derived d1 = (Derived) b;
		
		d1.m2();
		
	}
}
