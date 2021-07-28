class IfElseIfladder{
    public static void main(String args[]){
        int a=10;
        int b=10;
        int c=10;
        int d=10;
        if(a>b && a>c && a>d){
            System.out.println("a is the largest "+a);
        }
        else if(b>c && b>d && b>a){
            System.out.println("b is the largest "+b);
        }
        else if (c>d && c>a && c>b){
            System.out.println("c is the largest "+c);
        }
        else if (d>a && d>b && d>c){
            System.out.println("d is the largest "+d);
        }else{
            System.out.println("all are equal");
        }
    }
        
}