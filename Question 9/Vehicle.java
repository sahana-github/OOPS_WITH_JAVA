/*
Write a Java Program that does the following related to Inheritance:
a. Create an abstract class called Vehicle which contains the
‘year_of_manufacture’ data member and two abstract methods ‘getData()’ and
‘putData()’ with a constructor.
b. Create two derived classes “TwoWheeler” and “FourWheeler” and implement
the abstract methods. Make “FourWheeler” as final class.
c. Create class ‘MyTwoWheeler’ which is a sub-class of “TwoWheeler” and
demonstrate the use of super keyword to initialize data members of
“MyTwoWheeler”.
*/
import java.util.Scanner;
abstract class Vehicle{
    int year_of_manufacture;
    Vehicle(){
        this.year_of_manufacture = 0;
    }
    Vehicle(int a){
        this.year_of_manufacture = a;
    }
    abstract int getData();
    abstract void putData(int a);
}

class TwoWheeler extends Vehicle{

    TwoWheeler(){
        super();
    }
    TwoWheeler(int a){
        super(a);
    }
    int getData(){
        return this.year_of_manufacture;
    }
    void putData(int a){
        this.year_of_manufacture = a;
    }
}

final class FourWheeler extends Vehicle{

    FourWheeler(){
        super();
    }
    FourWheeler(int a){
        super(a);
    }
    int getData(){
        return this.year_of_manufacture;
    }
    void putData(int a){
        this.year_of_manufacture =a;
    }
}

class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(){
        super();
    }
    MyTwoWheeler(int a){
        super(a);
    }
    void putData(int a){
        super.putData(a);
    }
}

class Q9_Inheritance2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Object of MyTwoWheeler
        MyTwoWheeler  mtw = new MyTwoWheeler();
        System.out.println("-----------------------------------------");
        System.out.print("Enter the year of manufacture of your two wheeler:\t");
        int a = sc.nextInt();
        mtw.putData(a);
        System.out.println("The year of manufacture of my two wheeler is: "+mtw.getData());
        System.out.println("-----------------------------------------");
        //Object of FourWheeler;
        System.out.print("Enter the year of manufacture of the four wheeler:\t");
        int b = sc.nextInt();
        FourWheeler fw = new FourWheeler(b);
        System.out.println("The year of manufacture of the four wheeler is: "+fw.getData());
        System.out.println("-----------------------------------------");


        
    }
}
