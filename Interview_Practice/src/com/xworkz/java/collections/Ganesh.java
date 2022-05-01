package com.xworkz.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Ganesh {
	
	

	public static int equalizationCost(int n, int m, String s, List<String> t) {
		int count = 0;
		for (String t1 : t) {
			int i = 0;			
			StringBuffer sb = new StringBuffer(s);
			while (i < t1.length()) {
				if (t1.charAt(i) != sb.charAt(i)) {
					sb.deleteCharAt(i); 					
				}
				i++;
			}
			if(t1.equals(sb.toString())) {
				count+=1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine().trim());
		int m = Integer.parseInt(scan.nextLine().trim());
		String s = scan.nextLine();
		List<String> t = new ArrayList<String>(m);
		for (int j = 0; j < m; j++) {
			t.add(scan.next());
		}

		int result = equalizationCost(n, m, s, t);
		System.out.println(result);

	}
}
