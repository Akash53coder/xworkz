package com.xworkz.java.custom_exception.custom_checked_exception;

import java.util.Arrays;

public class Dmart {
	
	String[] dmartStore= {"doll","oil","chocolate","dry fruits","biscuits"};

		void searchItem(String item) throws DmartException {
			
			System.out.println(Arrays.binarySearch(dmartStore, item));
			if(Arrays.binarySearch(dmartStore, item)!=-1) {
				
				System.out.println("item present");
				
			}else {
				throw new DmartException();
			}
		}
}
