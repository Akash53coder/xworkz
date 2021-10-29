package com.xwrokz.oms.Wardrobe;

public class WardrobeOperatorTester {
	public static void main(String[] args) {
		WardrobeOperator wdrOp = new WardrobeOperator();
		if (wdrOp.add("t-shirt")) {
			System.out.println("thing added");
		} else {
			System.out.println("thing not added");
		}

		if (wdrOp.add("shirt")) {
			System.out.println("thing added");
		} else {
			System.out.println("thing not added");
		}

		if (wdrOp.add("pant")) {
			System.out.println("thing added");
		} else {
			System.out.println("thing not added");
		}

		if (wdrOp.add("hanger")) {
			System.out.println("thing added");
		} else {
			System.out.println("thing not added");
		}

		if (wdrOp.add("sandals")) {
			System.out.println("thing added");
		} else {
			System.out.println("thing not added");
		}

		if (wdrOp.update(2, "shoes")) {
			System.out.println("thing updated");
		} else {
			System.out.println("thing not updated");
		}

		if (wdrOp.delete(4)) {
			System.out.println("thing deleted");
		} else {
			System.out.println("thing not deleted");
		}

		if (wdrOp.match("sandals")) {
			System.out.println("thing matched");
		} else {
			System.out.println("thing not matched");
		}

		if (wdrOp.matchFirstChar("p")) {
			System.out.println("thing matched");
		} else {
			System.out.println("thing not matched");
		}

		if (wdrOp.matchLastChar("r")) {
			System.out.println("thing matched");
		} else {
			System.out.println("thing not matched");
		}

	}

}
