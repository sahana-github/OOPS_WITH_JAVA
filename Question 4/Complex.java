/*
Define a class Complex with data members as two real numbers, constructors for
initialization these numbers, methods to add, subtract and multiply 2 complex numbers
*/
import java.util.*;
public class Complex{
    Scanner sc = new Scanner(System.in);
    int a;
    int b;

    Complex(){
        this.a = 0;
        this.b = 0;
    }
    public void get(){
        System.out.print("Enter the real part:   ");
        a = sc.nextInt();
        System.out.print("Ener the imaginary part:   ");
        b = sc.nextInt();
    }
    public Complex sum_c(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a + c2.a;
        c3.b = c1.b + c2.b;
        return c3;
    }

    public Complex diff_c(Complex c1,Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a - c2.a;
        c3.b = c1.b - c2.b;
        return c3;
    }

    public Complex mul_c(Complex c1,Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a * c2.a - c1.b * c2.b;
        c3.b = c1.b * c2.a + c1.a * c2.b;
        return c3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex compute = new Complex();
        

        while(true){
            System.out.println("**********************Menu*******************************************");
            System.out.println("1.Add two complex Numbers");
            System.out.println("2.Subtract two complex Numbers");
            System.out.println("3.Multiply two complex Numbers");
            System.out.println("4. EXIT");

            int choice;
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                        System.out.println("Enter the Complex Number 1");
                        c1.get();
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the Complex Number 2");
                        c2.get();
                        System.out.println("------------------------------------------------");
                        compute = compute.sum_c(c1,c2);
                        System.out.print("The sum of two complex numbers is: ");
                        System.out.println(compute.a + " + "+ compute.b + " i");
                        break;
                
                case 2:
                        System.out.println("Enter the Complex Number 1");
                        c1.get();
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the Complex Number 2");
                        c2.get();
                        System.out.println("------------------------------------------------");
                        compute = compute.diff_c(c1,c2);
                        System.out.print("The difference of two complex numbers is: ");
                        System.out.println(compute.a + " + "+ compute.b + " i");
                        break;
                
                case 3:
                        System.out.println("Enter the Complex Number 1");
                        c1.get();
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the Complex Number 2");
                        c2.get();
                        System.out.println("------------------------------------------------");
                        compute = compute.mul_c(c1,c2);
                        System.out.print("The multiplication of two complex numbers is: ");
                        System.out.println(compute.a +" + "+"("+ (-1*compute.b) +")"+ " i");
                        break;

                case 4:
                        System.exit(0);
                default:
                        System.out.println("INVALID CHOICE");
            }
        }
    }
}
