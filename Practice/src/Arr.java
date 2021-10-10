import java.util.Scanner;
public class Arr {
   public static void main(String[] args) {
  
	   int inpuArray[]= {6,1,2,3,4,7};
	   int n=inpuArray.length;
      int sum = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+inpuArray[i];
      }
      int missingNumber = sum-sumOfArray;
      System.out.println("Missing number is: "+missingNumber);
   }
}