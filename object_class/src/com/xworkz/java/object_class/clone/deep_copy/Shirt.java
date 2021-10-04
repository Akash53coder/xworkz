package com.xworkz.java.object_class.clone.deep_copy;


	public class Shirt implements Cloneable{
		String brand="peter england";
		Button button=new Button("sqaure");
		
		@Override
		public String toString() {
			return "Shirt [brand=" + brand + ", button=" + button + "]";
		}
		
		public Shirt cloning() throws CloneNotSupportedException
		{
			Shirt copyOfShirt = (Shirt)super.clone();
			copyOfShirt.button = new Button("round");
			return copyOfShirt;
			
		}
}
