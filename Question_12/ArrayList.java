/*
 Write a java program to implement queues of Strings using an ArrayList class of the
Collection framework.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Q = new ArrayList<String>();
        while(true){
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Print elements with length less than 5");
            System.out.println("5. Exit!");

            System.out.println("Enter your choice:\t");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                        System.out.println("Enter the string you wanna enqueue:\t");
                        String x = sc.next();
                        Q.add(Q.size(),x);
                        break;
                case 2:
                        System.out.println("The dequeued string is "+ Q.remove(0));
                        break;
                
                case 3:
                        if(Q.isEmpty()){
                            System.out.println("No elements in the Queue");
                        }
                        System.out.println("The elements of the Queue are:");
                        for(int i=0;i<Q.size();i++){
                            System.out.println(Q.get(i));
                        }
                        break;
                case 4:
                        if(Q.isEmpty()){
                            System.out.println("No elements in the Queue");
                        }
                        System.out.println("The elements with length less than or equal to 5 are:\t");
                        for(int i=0;i<Q.size();i++){
                            if(Q.get(i).length() <=5){
                                System.out.println(Q.get(i));
                            }
                        }
                        break;
                case 5:
                        System.exit(0);
                default:
                        System.out.println("Invalid choice!");
            }
        }
    }
}
