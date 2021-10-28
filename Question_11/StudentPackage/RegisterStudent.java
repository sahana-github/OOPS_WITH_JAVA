package Question_11.StudentPackage;
import Question_11.student;
import Question_11.StudentPackage.result;
import java.util.Scanner;
public class RegisterStudent extends result implements student{
    Scanner sc = new Scanner(System.in);
    String name = "";
    String branch = ""; 
    int cre;
    public void setName(){
        System.out.print("Enter your name:\t");
        name = sc.nextLine();
    }
    public void setBranch(){
        System.out.print("Enter your Branch:\t");
        branch = sc.nextLine();
    }
    public void semester(int sem){
        if (sem == 1){
            setName();
            setBranch();
        }
        System.out.println("Enter the 6 subjects");
        for(int i=0;i<6;i++){
            System.out.print("Subject "+(i+1)+":\t");
            subject[i] = sc.next();
        }

        System.out.println("Enter the credits for all the subjects");
        for(int i=0;i<6;i++){
            System.out.print(" Credits for Subject "+(i+1)+":\t");
            credit[i] = sc.nextInt();
        }
        cre =0;
        for(int i=0;i<6;i++){
            cre += credit[i];
        }
        if(cre <=30){

        }
        else{
            throw new java.lang.Error("Credit limit exception");
        }
    }
}