
public class Typecasting {
	
	public static void main(String[] args) {

		char c = 'a';
		String s = String.valueOf(c);
		System.out.println(s);
		
//		int i =10;
//		String s= i; //not possible
		
//		int i =10;
//		String s= (String)i;//not possible
		
		int i20=0;
		System.out.println("int value "+i20);
	
		
		
		// same for all primitive values
		int i = 1;
		Integer i1 = i;
		String s1 = i1.toString();
		System.out.println(s1);
		
		//or  
		// same for all primitive values
		
		int i2 = 1;
		String s2 = String.valueOf(i2);
		System.out.println(s2);
		
		int k = 1;
		float f = k;
		//------------------
		int k1 = 1;
		double d = k;
		//------------------
		int k2 = 1;
		long l =k2;
		//------------------
		
		float f1 = 12.2f;
		int i3 = (int)f1;
		
		double d1 = 12.3;
		int i4 = (int)d1;
		
		char c1 = 'b';
		int k3 = c1;
		
		int k5 = 98;
		char c3 = (char)k5;
		
		//not possible
//		boolean b = false;
//		int k6 = (int)b;
		
		//not possible
//		int k6 =1;
//		boolean b = k6;
		
		
	}

}
