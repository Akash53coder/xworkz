
public class StringBufferDemo {

	public static void main(String[] args) {

		//Fomula capacity=(intial_capacity+1)*2
		
			StringBuffer sb1=new StringBuffer();
			System.out.println(sb1.capacity());
				
			sb1.append("abcdefghijklmnop");
			System.out.println(sb1.capacity());
				
			sb1.append("abcdefghijklmnopq");
			System.out.println(sb1.capacity());
			
			StringBuffer strb = new StringBuffer(90);
			System.out.println(strb.capacity());
			
			StringBuffer str1 = new StringBuffer("akash");
			System.out.println(str1.capacity());//21 (16+5)
			
			str1.append("mabali");
			System.out.println(str1.capacity());//21 (16+5)
			
			str1.append("is an engi");
			System.out.println(str1.capacity());//21
			
			str1.append("is an engin");
			System.out.println(str1.capacity());//44
			
			
			// Methods inside in StringBuffer
			//public int length();
			//public int capacity();
			//public char charAt(int index);
			
			//public StringBuffer insert(int index, StringBuffer sb);
			//public StringBuffer insert(int index, int i); //all types posibble
			
			//public void setCharAt(int index,char c);
			//public StringBuffer append(String sb);
			//public StringBuffer append(StringBuffer sb);
			//public StringBuffer append(byte b);
			//public StringBuffer append(int i);
			//public StringBuffer append(boolean b); etc...float.double..
			
			//public StringBuffer delete(int begin_index, int end_index);//give begin_index, end_index-1
			
			//public StringBuffer deleteCharAt(int index);
			
			//public StringBuffer reverse();
			
			StringBuffer sb = new StringBuffer("akash");
			System.out.println(sb.append(false)); //akashfalse
			
			//not posibble only 3 constructors are defined
			// StringBuffer(); StringBuffer("as"); StringBuffer(int cpaicty);
//			byte b[]= {98,97,99};
//			StringBuffer sb3 = new StringBuffer(b);
			
			
			
			
			
		
	}

	

}
