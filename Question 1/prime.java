/*
To check prime numbers.
*/
import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wanna check:     ");
        int num = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=num/2;i++){
                if(num%i == 0){
                    flag = 1;
                    break;
                }
                else{
                    flag =0;
                }
        }
        if(flag == 1){
            System.out.println("The number "+ num +" is not a prime number");
        }
        else{
            if(num != 1)
                System.out.println("The number "+ num +" is a prime number"); 
            else
                System.out.println("The number "+num+" is neither prime nor composite");
        }
    }
}
