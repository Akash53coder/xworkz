package com.xworkz.interfaceex;

//Can an interface extend class ? or implement another interface
public interface InterfaceDemoTwo {

	 void m1();
	 int a = 10;
}

//interface InterfaceOne implements InterfaceDemoTwo{
	//Interface cannot implements another interface 
//}

class Abc{
	
}

//Error
//interface InterfaceTwo extends Abc{
	//No interface cannot extend a class
//}

//interface InterfaceThree extends InterfaceOne{
	
	//but an interface can extend another interface
//}