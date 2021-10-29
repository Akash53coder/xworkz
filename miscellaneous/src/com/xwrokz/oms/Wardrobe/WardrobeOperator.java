package com.xwrokz.oms.Wardrobe;

public class WardrobeOperator {
	private String[] container = new String[5];
	private int counter;

	public WardrobeOperator() {
		System.out.println("no-arg constructor called");
	}

	public boolean add(String thing) {
		if (thing != null && this.counter < this.container.length) {
			System.out.println("add method invoked" + thing);
			this.container[this.counter++] = thing;
			System.out.println("thing added " + thing);
			return true;
		} else {
			System.out.println("either thing not passed or container is full");
			return false;
		}
	}

	public boolean update(int index, String newthing) {
		if (newthing != null && this.counter < this.container.length) {
			System.out.println("update method invoked" + newthing);
			this.container[index] = newthing;
			System.out.println("thing updated " + newthing);
			return true;
		} else {
			System.out.println("either thing not passed or container is full");
			return false;
		}
	}

	public boolean delete(int no) {
		if (no > this.container.length) {
			this.container[no] = null;
			return true;
		} else {
			System.out.println("no rack size present");
			return false;
		}
	}

	public boolean match(String thing) {
		for (int i = 0; i < this.container.length; i++) {
			if (this.container[i].equals(thing)) {
				System.out.println("thing found " + thing);
				return true;
			}
		}
		return false;
	}

	public boolean matchFirstChar(String ch) {
		for (int i = 0; i < this.container.length; i++) {
			if (this.container[i].startsWith(ch)) {
				System.out.println("thing found " + ch);
				return true;
			}
		}
		return false;
	}

	public boolean matchLastChar(String ch) {
		for (int i = 0; i < this.container.length; i++) {
			if (this.container[i].endsWith(ch)) {
				System.out.println("thing found " + ch);
				return true;
			}
		}
		return false;
	}
}
