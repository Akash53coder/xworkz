class NestedForLoop{
    public static void main(String args[]){
        // To print 2 4 6 8
        //          2 4 6 8
        //          2 4 6 8
        //          2 4 6 8

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++)
            {
                System.out.print(j*2+" ");
            }
            System.out.println();
        }

 /* to print patter 1 2 3 4  
                    5 6 7 8  */
        System.out.println("-------------------------------------------");                        

            for(int i=1;i<=8;i++){                
                System.out.print(i);
                for(int j=1;j<=1;j++){
                    System.out.print(" ");
                }
                if(i%4==0){
                    System.out.println();
                }
                
            }

/* For printing Prime numbers 1 to 50 */
        System.out.println("-------------------------------------------");                        

        for(int i=1;i<=50;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }                
            }
            if(count==2){
                    System.out.print(i+" ");
                }
        }

        /* for printing pattern of * * * *
                                   * * * * 
                                   * * * *
                                   * * * *      */
        System.out.println("-------------------------------------------");                        
        for(int i=1;i<=3;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }        


    }
}










