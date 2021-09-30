package com.xworkz.java.custom_exception.custom_unchecked_exception;

public class Whatsapp {
	
	public void createGroup(String[] names) throws WhatsappException{
		
		if(names.length>5) {
			throw new WhatsappException("cannot create a group of members >5");
		}else {
			System.out.println("Group created");
		}
	}
	
	
	void shareFile(File file) throws WhatsappException{
		if(file.size>1024) {
			throw new WhatsappException("file uploaded is >1024");
		}else {
			System.out.println("File uploaded");
		}
	}
}
