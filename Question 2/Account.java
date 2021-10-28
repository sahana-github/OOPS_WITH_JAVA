/*Create a class called account with the data members(Accno – integer, name String,
Phone_No: integer, balance_amt:float), and following methods :
a. getinput() to get input from the user
b. Deposit() method which takes the amount to be deposited in to his/her account and
do the calculation.
c. Withdraw() method which gets the amount to be withdrawn from his/her account.
d. Print the appropriate results.*/

import java.util.*;
public class Account{
    long accNo;
    String name;
    long phoneNo;
    float balAmt =0;
    Scanner sc = new Scanner(System.in);
    public void getDetails(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter the Account No:          ");
        accNo = sc.nextLong();
            sc.nextLine();
        System.out.println("Enter your name:          ");
        name = sc.nextLine();
        System.out.println("Enter the Phone No:          ");
        phoneNo = sc.nextLong();

        System.out.println("Current Balance in the Account is:          Rs "+balAmt);
    }

    public void deposit(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter the amount you want to deposit");
        float deposit;
        deposit = sc.nextFloat();
        balAmt +=deposit;
        System.out.println("Current Balance is:           Rs "+balAmt);
    }

    public void withdraw(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter the amount you wanna withdraw");
        float withdraw;
        withdraw = sc.nextFloat();
        if(withdraw <=balAmt){
            balAmt -=withdraw;
            System.out.println("Current Balance is:           Rs "+balAmt);
        }
        else{
            System.out.println("Your account does not have sufficient balance");
        }
    }

    public void printDetails(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("The details of the user are:");
        System.out.println("The Account No is:          "+accNo);
        System.out.println("The Name of the account holder is:          "+name);
        System.out.println("The Phone No of the account holder is:          "+phoneNo);
        System.out.println("The current balance is:           Rs "+balAmt);
    }
    public static void main(String[] args){
        Account a1 = new Account();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-------------------------------------------------------------");
            System.out.println("State Bank of India");
            System.out.println("1.Enter user details");
            System.out.println("2.Deposit Money in the account");
            System.out.println("3.Withdraw Money from the account");
            System.out.println("4. Print User details");
            System.out.println("5.EXIT");

            System.out.println("Enter your choice:          ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                        a1.getDetails();
                        break;
                case 2:
                        a1.deposit();
                        break;
                case 3:
                        a1.withdraw();
                        break;
                case 4:
                        a1.printDetails();
                        break;
                case 5:
                        System.out.println("Thank you:)");
                        System.exit(0);
                default:
                        System.out.println("Invalid choice");
                
            }
        }
    }
}
