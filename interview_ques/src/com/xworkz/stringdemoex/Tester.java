package com.xworkz.stringdemoex;

class Tester{
//remove white space
    public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		String[] s = str.split("\\s");
		StringBuffer sb = new StringBuffer();
		for(String st : s){
		    if(!st.equals("\\s")){
		        sb.append(st);
		    }
		    
		}
    	
//    	String sb = str.replaceAll("\\s", "");
        return sb.toString();
	}
	
	public static void main(String args[]){
		String str = " Jav a   pro    gramming ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
