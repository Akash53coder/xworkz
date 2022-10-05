package com.xworkz.javaeight_lambda;

import java.util.ArrayList;
import java.util.List;

//Example with user defined method
interface Shape
{
     void display();
}

class MethodReferenceDemo 
{
    public static void methodDisplay()
    {
        System.out.println("Squircle");
    }
    
    public static void main (String[] args) {
        Shape s = MethodReferenceDemo::methodDisplay;
        s.display();
        
        Shape s1 = () -> MethodReferenceDemo.methodDisplay();
        s1.display();
    }
}

//Example with predefined method
class Em
{
	private Integer empId;
    private String empName;
    private String country;
    
	public Em(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Em [empId=" + empId + ", empName=" + empName + ", country=" + country + "]";
	}

	public static int compareByCountry(Em Em1, Em Em2) {
        return Em1.getCountry().compareTo(Em2.getCountry());
    }
    
}

class MethodReferenceTest {  
    
    public static void main(String[] args) { 
    	Em e1 = new Em(101,"Aron","Spain");
    	Em e2 = new Em(102,"Cindia","Portugal");
    	Em e3 = new Em(103,"Zidane","France");
    	List<Em> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	System.out.println("Before sorting : "+empList);
    	empList.sort(Em::compareByCountry);
    	System.out.println("After sorting : "+empList);
    }  
} 
