/*
To print Fibonacci series using recursion.(concept of
loops, data types)
*/
import java.util.*;
public class fibonacci_recursion{
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return (fib(n-1)+fib(n-2));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms you want");
        int n = sc.nextInt();

        System.out.print("The fibonacci series is:   ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+"  ");
        }

    }
}
