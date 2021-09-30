package com.xworkz.java.singled_arrays;

public class FreuencyOfElements {
	
	public static void main(String ags[]) {
		
		int[] a = {1,3,4,5,1,2};
		for(int i=0;i<a.length;i++) {
			int ct=1;
			for(int j=i+1;j<a.length;j++) {
				if(i!=j) {
					if(a[i]==a[j]) {
						ct+=1;
					}
				}
			}
			System.out.println(a[i]+" "+ct);

		}
	}

}
