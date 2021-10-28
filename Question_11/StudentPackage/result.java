package Question_11.StudentPackage;
import Question_11.student;
import Question_11.StudentPackage.RegisterStudent;
import Question_11.ResultPackage.grade;
public abstract class result extends grade implements student{
    
    double sgpa[] = new double[4];
    double cgpa = 0;;
    int totalCre[] = new int[4];
    int obtCre[] = new int[4];
    public void sgpaCalculate(int p){
        int k = p-1;
        for(int i=0;i<6;i++){
            if(grade[k][i] == 'S'){
                obtCre[k] += credit[i]*10;
            }
            
            else if(grade[k][i] == 'A'){
                obtCre[k] += credit[i]*9;
            }
            
            else if(grade[k][i] == 'B'){
                obtCre[k] += credit[i]*8;
            }
            
            else if(grade[k][i] == 'C'){
                obtCre[k] += credit[i]*7;
            }
            
            else if(grade[k][i] == 'D'){
                obtCre[k] += credit[i]*6;
            }
            
            else if(grade[k][i] == 'E'){
                obtCre[k] += credit[i]*5;
            }
            
            if(grade[k][i] == 'F'){
                obtCre[k] += credit[i]*4;
            }
            totalCre[k] += credit[i];
        }
        sgpa[k] = obtCre[k]/totalCre[k];
        System.out.println("The CGPA obtained in "+(k+1)+"sem is "+sgpa[k]);
    }


public void cgpaCalculate(){
    double s = 0;
    for(int k=0;k<4;k++){
        s += sgpa[k];
    }
    cgpa = s/4;
    System.out.println("-----------------------");
    System.out.println("The CGPPA obtained is "+cgpa);
    System.out.println("-----------------------");
}
}