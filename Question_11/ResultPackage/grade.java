package Question_11.ResultPackage;
import Question_11.student;
import java.util.Scanner;
public abstract class grade implements student{
    public char grade[][] = new char[4][6];
    public int marks[][] = new int[4][6];
    Scanner sc = new Scanner(System.in);
    public void marksObt(int sem){
        for(int i=0;i<6;i++){
            System.out.print("Enter the marks in "+subject[i]+":\t");
            marks[sem-1][i] = sc.nextInt();
        }
    }
    public void gradeConv(int sem){
        for(int i=0;i<6;i++){
               if(marks[sem-1][i] >= 90){
                   grade[sem-1][i] = 'S';
               }
               else if(marks[sem-1][i] >= 80){
                   grade[sem-1][i] = 'A';
               }
               
               else if(marks[sem-1][i] >= 70){
                    grade[sem-1][i] = 'B';
                }
            
            else if(marks[sem-1][i] >= 60){
                    grade[sem-1][i] = 'C';
                }
            
            else if(marks[sem-1][i] >= 50){
                    grade[sem-1][i] = 'D';
                }
            
            else if(marks[sem-1][i] >= 40){
                    grade[sem-1][i] = 'E';
                }
            
            else {
                    grade[sem-1][i] = 'F';
                }
    }
}
}