
public class NestedIf {	
	public static void main(String args[]) {
		
		boolean havingAccount=true;
		String accountName="SBI230";
		boolean havingMinBalance=true;
        int salary=23000;
		
		if(havingAccount) {
			if(accountName.startsWith("SBI")) {
                if(salary>=20000){
                    if(havingMinBalance){
                        System.out.println("Candidate can apply for credit card");
                    }else{
                        System.out.println("Candidate not having minimum balance");
                    }
                }
                else{
                    System.out.println("Candidate not having enough salary");
                }
            }else{
                System.out.println("Candidate is not a SBI account holder");
            }
        }else{
            System.out.println("Candidate not having account");
        }
    }
}

				
