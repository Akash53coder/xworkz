class AirthmeticDemo{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int mod(int a,int b){
        return a%b;
    }
    public static void main(String args[])
    {
        AirthmeticDemo demo=new AirthmeticDemo();
        System.out.println("addition "+demo.add(10,20));
        System.out.println("subtraction "+demo.sub(20,10));
        System.out.println("multiplication "+demo.mul(10,20));
        System.out.println("division "+demo.div(100,20));
        System.out.println("modulus "+demo.mod(15,2));

    }
}