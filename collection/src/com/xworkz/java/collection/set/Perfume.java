package com.xworkz.java.collection.set;

public class Perfume {

	double price;
	String flavour;
	String brand;
	String type;
	
	Perfume(double price, String flavour, String brand, String type){
		this.brand=brand;
		this.flavour=flavour;
		this.price=price;
		this.type=type;
	}

	@Override
	public String toString() {
		return "Perfume [price=" + price + ", flavour=" + flavour + ", brand=" + brand + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfume other = (Perfume) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Perfume per = (Perfume)obj;
//		if(this.brand.equals(per.brand)) {
//			if(this.flavour.equals(per.flavour)) {
//				if(this.price==per.price) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
}

