package Question_10.ISE;
import java.util.Scanner;
import Question_10.Department;
import Question_10.Faculty;
public class ISE_department implements Department{
    Scanner sc = new Scanner(System.in);
    public void readData(Faculty f){
        System.out.println("Enter the name of the faculty:\t");
        f.name = sc.next();
        System.out.println("Enter the designation of the faculty:\t");
        f.designation = sc.next();
        System.out.println("Enter the years of experience  of the faculty:\t");
        f.years_of_experience = sc.nextInt();
        System.out.println("Enter all the subjects  handled by the faculty:\t");
        f.subjects_handled = sc.next();
        System.out.println("Enter the number of research consultancy projects taken by the faculty:\t");
        f.number_research_consultancy_projs = sc.nextInt();
        System.out.println("Enter the number of designations the faculty had till date:\t");
        f.number_designations = sc.nextInt();
        System.out.println("Enter the joining date of the faculty:\t");
        f.Joining_date = sc.next();
        System.out.println("Enter the age of the faculty");
        int tempAge = sc.nextInt();
        if(tempAge <=58){
            f.age = tempAge;
        }
        else{
            throw new java.lang.Error("Age Exception!");
        }

    }

    public void printData(Faculty f){
        System.out.println("The name of the faculty is: "+f.name);
        System.out.println("The age of the faculty is :"+f.name);
        System.out.println("The designation of the faculty is: "+f.designation);
        System.out.println("The years of experience of the faculty is: "+f.years_of_experience);
        System.out.println("The subjects handled by the faculty are: "+f.subjects_handled);
        System.out.println("The joining date of the faculty is :"+f.Joining_date);
        System.out.println("The no of designations the faculty had till date are: "+f.number_designations);
        System.out.println("The number of research consultancy projects the faculty took till date are: "+f.number_research_consultancy_projs);

    }

    public void print_number_designations(Faculty f){
        System.out.println("The number of designations the faculty had till date are :"+f.number_designations);
    }

    public void number_research_consultancy_projs(Faculty f){
        System.out.println("The number of research consultancy projects the faculty took till date are: "+f.number_research_consultancy_projs);
    }

}
