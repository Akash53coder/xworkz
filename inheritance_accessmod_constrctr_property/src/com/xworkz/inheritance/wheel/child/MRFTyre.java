package com.xworkz.inheritance.wheel.child;

import com.xworkz.inheritance.wheel.parent.Tyre;

public class MRFTyre extends Tyre{

	public boolean allTerrain;
	public MRFTyre() {
		super();
		System.out.println(super.warranty);
		// or
		System.out.println(warranty);
		//though tubeLess is public I can access using super
		System.out.println(super.tubeLess);
		 
	}

}
