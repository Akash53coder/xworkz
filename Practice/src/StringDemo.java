
public class StringDemo {

	public static void main(String[] args) {

		String str1="akash";
		String str2="amabali";
		String str3="ash";
		String str="";
		
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));		
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf("ash"));
		System.out.println(str1.indexOf('a', 1));//offset index
		System.out.println(str1.indexOf("as", 1));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf("ash"));
		
		System.out.println(str1.contains(str3));
		System.out.println(str1.endsWith("sh"));
		System.out.println(str1.startsWith("ak"));
		
		System.out.println(str1.startsWith("ak", 0));
		
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(0, 2));
		
		System.out.println(str.isEmpty());
		
		
		StringBuffer sb = new StringBuffer(str1);
		String s = new String(new StringBuffer("as"));
		System.out.println(sb);
		System.out.println(s);
		
		byte[] b = {33,98,99};
		String s1 = new String(b);
		System.out.println(s1);
		
		char[] c = {'a','b'};
		String s2 = new String(c);
		System.out.println(s2);
				
		
		
		
	}

}
