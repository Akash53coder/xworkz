package com.xworkz.stringdemoex;

public class StringBufferClass {

	// Objects of StringBuffer and StringBuilder are mutable
	// difference between StringBuffer and StringBuilder
	
	// StringBuffer                  |      StringBuilder
	// Thread safe or synchronized   |	   not thread safe or non-synchronized
	// Low performance               |     high performance
	// single thread can operate     |     multiple threads can operate
    // 1.0v                          |     1.5v
	
	//equals is not overridden in StringBuffer and StringBuilder
	
	//growth ratio formula, a newer StringBuffer object will be created with capacity 
	//(current_capacity+1)*2 = (16+1)*2 = 34 same for StringBuidler also
	public static void main(String[] args) {
		
//		String s = "akash";
//		StringBuffer buf = new StringBuffer(s);
//		StringBuilder build = new StringBuilder("aka");
//		
//		String s1 = new String(buf);
//		String s2 = new String(build);
		
		
		StringBuffer buffer = new StringBuffer();
		//StringBuffer(); initial capacity - 16 characters
		//StringBuffer(int initial_capacity) 
		//StringBuffer(String str)
		
		//methods of StringBuffer
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		System.out.println(buffer.append("str")); //parameter can be boolean, 
		//int, byte, String, char[]
//		System.out.println(buffer.append(""));
		System.out.println(buffer.reverse());
//		System.out.println(buffer.delete(0, 1));
//		System.out.println(buffer.deleteCharAt(0));
		System.out.println(buffer.toString());
		System.out.println(buffer.insert(0,"akash"));
		System.out.println(buffer.substring(0));// can also be substring(start, end)
		//void buffer.setCharAt(0, 'a');
		
		System.out.println("**"+buffer.capacity());//16
		buffer.append("akashmabaliisabs");
		System.out.println(buffer.capacity());//16
		buffer.append("a");//adding 17th character 
		System.out.println(buffer.capacity());//34
		System.out.println(buffer.length());
		
		System.out.println(buffer);
		
//		StringBuffer bf = new StringBuffer("klk");
//		System.out.print("---" + bf.insert(1, "zzz"));//it won't delete char at 1 position, 
		//but it will shift the char -> kzzzlk 
		
		
		StringBuffer sb1 = new StringBuffer("man");
		StringBuffer sb2 = new StringBuffer("man");
		
		System.out.println(sb1.equals(sb2));
		
		
	}
	
}
