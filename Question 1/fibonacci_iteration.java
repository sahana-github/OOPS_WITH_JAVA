/*
To print Fibonacci series without using recursion(concept of
loops, data types)
*/
import java.util.*;
/*
  Without recursion
*/
public class fibonacci_iteraion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want:   ");
        int n = sc.nextInt();

        int a=0,b=1,c;
        int i=0;
        System.out.print("The series is:  ");
        while(i<n){
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
            i++;
        }
    }
}
