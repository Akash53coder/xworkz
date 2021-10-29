package com.xwrokz.oms.Wardrobe;

public class WardrobeOperatorTester {
	public static void main(String[] args) {
		WardrobeOperator wdrOp = new WardrobeOperator();
		wdrOp.add("t-shirt");
		wdrOp.add("shirt");
		wdrOp.add("pant");
		wdrOp.add("hanger");
		wdrOp.add("sandals");
		
		wdrOp.update(2, "shoes");
		
		wdrOp.delete(4);
		
		wdrOp.match("sandals");
		wdrOp.matchFirstChar("p");
		wdrOp.matchLastChar("r");
		
		
	}
	
}
