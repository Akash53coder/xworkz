package com.xworkz.inheritance.wheel;

import com.xworkz.inheritance.wheel.child.MRFTyre;
import com.xworkz.inheritance.wheel.parent.ApolloTyre;
import com.xworkz.inheritance.wheel.parent.Tyre;

public class TyreStarter {

	public static void main(String[] args) {
		// I can create a insatance only for public Tyre()
//		Tyre tyre = new Tyre();
//		System.out.println(tyre.warranty);

		// as my tyre() is protected I cannot create a instance

		MRFTyre mrf = new MRFTyre();
		// cannot do System.out.println(mrf.warranty); // as warranty is protected
		// unable to access it using reference mrf. only allowed for child class

		System.out.println(mrf.tubeLess);
		System.out.println(mrf.allTerrain);

		ApolloTyre aplo = new ApolloTyre();
		System.out.println(aplo.allWheather);
		System.out.println(aplo.tubeLess);
		
		//here other fields like allTerrain is not visible bcz mrfTyre is of type Type
		//in which allTerrain is not visible for it
		Tyre mrfTyre = new MRFTyre();
		System.out.println(mrfTyre.tubeLess);
		
		//Inorder to make all the fields of MRFTyre visible I need to type cast it 
		//with instanceof check (to prevent ClassCastException, I use instanceof)
		if(mrfTyre instanceof MRFTyre) {
			//down casting
			MRFTyre mTyre = (MRFTyre)mrfTyre; // here mrfTyre is of type Tyre I am typecasting it
			System.out.println(mTyre.allTerrain);
		}
		
		Tyre aploTyre = new ApolloTyre();
		System.out.println(aploTyre.tubeLess);
		
		//Casting examples
		//The main moto use of instanceof is to remove class ClassCastException
		Tyre t1 = new Tyre();
		if(t1 instanceof Tyre) {
			System.out.println("t1 is instance of Tyre");
		}
		
		MRFTyre mrfTyre1 = new MRFTyre();
		if(mrfTyre1 instanceof Tyre) {
			System.out.println("mrfTyre1 is instance of MRFTyre");//true
		}
		if(mrfTyre1 instanceof Tyre) {//here Tyre is parent and t2 will be instance of it as it inherit MRFTyre
			System.out.println("mrfTyre1 is also instance of Tyre");//true
		}
		
		Tyre t2 = new MRFTyre();
		if(t2 instanceof MRFTyre) {
			System.out.println("t2 is instance of MRFTyre");//true
		}
		if(t2 instanceof Tyre) {//here Tyre is parent and t2 will be instance of it
			System.out.println("t2 is instance of Tyre also");//true
		}
		if(t2 instanceof Object) {//here Object is parent and t2 will be instance of it
			System.out.println("t2 is instance of Object also");//true
		}		
		//same for ApoloTyre also

	}
}
