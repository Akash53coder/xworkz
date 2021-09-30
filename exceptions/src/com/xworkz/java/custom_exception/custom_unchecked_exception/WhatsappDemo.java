package com.xworkz.java.custom_exception.custom_unchecked_exception;

public class WhatsappDemo {

	public static void main(String[] args) {
		
		File file = new File();
		
		Whatsapp wp = new Whatsapp();
		String[] names = {"akash","ravi","yash","ram","shan","kiran"};
		try {
			wp.createGroup(names);
			wp.shareFile(file);
		}catch(WhatsappException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
