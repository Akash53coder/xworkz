

class Scizzeler{
    
    String name;
    String branch;
    String usn;
    int yearOfPassing;

    void details(){
    
        System.out.println("Name : "+name+", Branch : "+branch+", USN : "+usn+", Year of Passing : "+yearOfPassing);
    }


    public static void main(String args[]){
        Scizzeler scz1=new Scizzeler();
        scz1.name="Akash";
        scz1.branch="CSE";
        scz1.usn="2ka16cs006";
        scz1.yearOfPassing=2020;
        scz1.details();

        Scizzeler scz2=new Scizzeler();
          scz2.name="Adarsh";
        scz2.branch="ME";
        scz2.usn="2ka16me008";
        scz2.yearOfPassing=2022;
        scz2.details();

       Scizzeler scz3=new Scizzeler();
         scz3.name="Girish";
        scz3.branch="ECE";
        scz3.usn="2ka16ec020";
        scz3.yearOfPassing=2019;
        scz3.details();

        Scizzeler scz4=new Scizzeler();
         scz4.name="Sahana";
        scz4.branch="EEE";
        scz4.usn="2ka16ee008";
        scz4.yearOfPassing=2022;
        scz4.details();

        Scizzeler scz5=new Scizzeler();
         scz5.name="Ramesh";
        scz5.branch="ISE";
        scz5.usn="2ka16is008";
        scz5.yearOfPassing=2020;
        scz5.details();


    }
}



