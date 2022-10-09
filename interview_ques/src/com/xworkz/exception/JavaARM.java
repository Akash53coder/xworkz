package com.xworkz.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//java 7 ARM feature
//So java 7 one of the improvements was try-with-resources where we can create a resource in
//the try statement itself and use it inside the try-catch block. 
//When the execution comes out of the try-catch block, the runtime environment 
//automatically closes these resources. Sample of try-catch block with this improvement is:
public class JavaARM {
	public static void main(String[] args) {
//		try (MyResource mr = new MyResource()) {
//            System.out.println("MyResource created in try-with-resources");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		String s = "../interview_ques/src/com/xworkz/exception/abc.txt";
		//BufferedReader Creates a buffering character-input stream that uses a default-sized input buffer.

		try(BufferedReader bf = new BufferedReader(new FileReader(s))){
			String str = null;
			ArrayList<Integer> list = new ArrayList<>();
			while((str = bf.readLine()) != null) {
				Integer i = Integer.parseInt(str);
				list.add(i);
			}
			Collections.sort(list);
			//to write into the file
			String another = "../interview_ques/src/com/xworkz/exception/another.txt";
			try(BufferedWriter bfw = new BufferedWriter(new FileWriter(another))){
				for(int i : list) {
					System.out.println("yes");
					//write only allow Strings
					bfw.write(i + ", ");
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
