import java.lang.reflect.Method;
class Student{
    public String getName(){
        return null;
    }
    public int getRollNo(){
        return 10;
    }
}
class Test{
    public static void main(String args[])
    {
        int count=0;
        Student s=new Student();
        Class c=s.getClass();//we can call any class here like Object,String etc
        Method[] m=c.getDeclaredMethods();
        for(Method m1:m){
            count++;
            System.out.println(m1);
        }
        System.out.println(count);
    }
}

//local varible must be initialized 
//should not be given any of the accesser modifiers

//static variable can be called using class name and it can also be used using 
//object as well (but not recommended because its a class variable)
//all global variables are initialized by compiler but local variables must be initialized
//local varibale cant be static and call through object reference


//a non-static method can access static variable and a static method
//cannot access a non-static member.