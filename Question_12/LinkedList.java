/*
Create a linked list of names (String type). Use an Iterator to traverse through the list and print those
names whose length is < 5.
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList{

    public static void main(String[] args){
        LinkedList<String> ll  = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("1. Add element to the Linked list");
            System.out.println("2. Delete an element from the head");
            System.out.println("3. Display the elements using an Iterator");
            System.out.println("4. Display elements with Length less than 5 using an Iterator");
            System.out.println("5. Exit!");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                        System.out.println("Enter the elemnet you wanna add");
                        String x = sc.next();
                        ll.add(x);
                        break;

                case 2:
                        System.out.println("The element removed is "+ ll.remove(0));
                        break;
                case 3:
                        if(ll.peek() == null){
                            System.out.println("The LinkeList is Empty");
                        }
                        else{
                            System.out.println("The elements of the Linekd list are:");
                            Iterator<String> itr = ll.iterator();
                            while(itr.hasNext()){
                                System.out.println(itr.next());
                            }
                        }
                        break;
                case 4:
                        if(ll.peek() == null){
                            System.out.println("The LinkedList is Empty");
                        }
                        else{
                            /*
                                It is necessary to typecast an iterator only when The generic has not been defined while 
                                Initilaizing the iterator, if we have Iterator<String> itr = n=ll.iterator();, then it is not necessary 
                                to type cast whule uding itr.next(), this will return string only
                            */
                            String e1="";
                            System.out.println("The elements with length less than 5 are");
                            Iterator<String> itr = ll.iterator();
                            while(itr.hasNext()){
                                e1 = itr.next();
                                if(e1.length()<5){
                                    System.out.println(e1);
                                }
                            }
                        }
                        break;
                case 5:
                        System.exit(0);
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
