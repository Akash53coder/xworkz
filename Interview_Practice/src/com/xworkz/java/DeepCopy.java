package com.xworkz.java;

class Cat {

	int j;
	Cat(int j){
		this.j = j;
	}
	
}

class Dog implements Cloneable {
	Cat c;
	int i;
	Dog(Cat c, int i){
		this.c = c;
		this.i = i;
	}
	
	public Object clone() throws CloneNotSupportedException{
		//shallow clonning 
		//return super.clone();
		return new Dog(new Cat(this.c.j),this.i);
	}
}

public class DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dog d1 = new Dog(new Cat(20),10);
		System.out.println(d1.i +" ..d1... " +d1.c.j);
		Dog d2 = (Dog)d1.clone();
		System.out.println(d2.i + " ...d2..."+ d2.c.j);
		d2.c.j = 888;
		System.out.println(d1.i +" ..d1... " +d1.c.j);
	}
}
