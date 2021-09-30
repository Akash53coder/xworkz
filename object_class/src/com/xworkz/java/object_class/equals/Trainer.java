package com.xworkz.java.object_class.equals;

public class Trainer {

	String name;
	String gender;
	int yearsOfExperience;
	
	Trainer(String name,String gender,int yearsOfExperience){
		
		this.name=name;
		this.gender=gender;
		this.yearsOfExperience=yearsOfExperience;
	}
	// when we write a equals method by our own no need to override hashcode()
	//if elcipse do for us then hashcode() along with the equals will be overriden by 
	//the current object's equals because of the java constract between hashcode & equals.
	
	public boolean equals(Object obj) {
		//if i try to access the states of obj then the states of trainer class object 
		//will be invisble for me
		//obj.name leads to compilation error. bcz name is invisble to obj so we type cast it
		if(obj instanceof Trainer) {
			//here it is type casted bcz obj is of type Object 
			Trainer trainer = (Trainer)obj;
			if(this.name.equals(trainer.name)) {
				if(this.gender.equals(trainer.gender)) {
					if(this.yearsOfExperience==trainer.yearsOfExperience) {
						return true;
					}else {
						return false;
					}
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
}
