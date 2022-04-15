package com.xworkz.java;

class Calendar{
	public String month = "Jan"; 
	public final String  MON = "Feb"; //final should be always before data type 
	
    public static int getBirthMonth(String personName){
        if(personName=="Sindhu"){
            return 3;
        }
        else if(personName=="john"){
            return 23;
        }
        else if(personName=="steve"){
            return 24;
        }
        else if(personName=="wozniak"){
            return 14;
        }
        else{
            return 0;
        }
    }
    public static String getBirthDay(String personName){
        if(personName=="Sindhu"){
            return "sunday";
        }
        else if(personName=="john"){
            return "monday";
        }
        else if(personName=="steve"){
            return "saturday";
        }
        else if(personName=="wozniak"){
            return "tuesday";
        }
        else{
            return null;
        }
    }
    
    public static int checkInstance(Calendar c) {
    	if(c instanceof Calendar) {
    		return 1;
    	}
    	return 0;
    }
    public static void main(String[] args) {
//        System.out.println(Calendar.getBirthMonth("steve"));
//        System.out.println(getBirthDay("dfd"));
    	checkInstance(new Calendar());//optional to hold the returned value
    	String a = new Calendar().month;//mandatory to hold the value
    	
    }
}
