package Question_11;
import  Question_11.StudentPackage.*;
import Question_11.ResultPackage.*;
public class MainClass{
    
    public static void main(String[] args){
        RegisterStudent r = new RegisterStudent();
        System.out.println("-----------Semester 1-----------");
        r.semester(1);
        r.marksObt(1);
        r.gradeConv(1);
        r.sgpaCalculate(1);

        System.out.println("-----------Semester 2-----------");
        r.semester(2);
        r.marksObt(2);
        r.gradeConv(2);
        r.sgpaCalculate(2);

        System.out.println("-----------Semester 3-----------");
        r.semester(3);
        r.marksObt(3);
        r.gradeConv(3);
        r.sgpaCalculate(3);

        System.out.println("-----------Semester 4-----------");
        r.semester(4);
        r.marksObt(4);
        r.gradeConv(4);
        r.sgpaCalculate(4);

        System.out.println("The cgpa obtained after 4 semesters is :");
        r.cgpaCalculate();
    }
}