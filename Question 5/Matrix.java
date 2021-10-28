/*
Write a java program to read 2 matrices and place the product in a third matrix. Use
constructors and suitable methods. 
*/
import java.util.*;
public class Matrix{
    int array[][];
    int size;
    Matrix(int size){
        this.size = size;
        this.array = new int[size][size];
    }
    Scanner sc = new Scanner(System.in);
    public void get_input(){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    array[i][j] = sc.nextInt();
                }
            }
    }

    public void matrix_mul(Matrix m1,Matrix m2){
            for(int i=0;i<m1.size;i++){
                    for(int j=0;j<m1.size;j++){
                        for(int k=0;k<m1.size;k++){
                            array[i][j] += m1.array[i][k] * m2.array[k][j];
                        }
                    }
            }
    }

    public void print_matrix(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is valid for two square matrices of same order ");
        System.out.println("Enter the order of both the matrices");
        int size;
        size = sc.nextInt();

        Matrix m1 = new Matrix(size);
        Matrix m2 = new Matrix(size);
        Matrix m3 = new Matrix(size);

        System.out.println("Enter the elements of matrix 1");
        m1.get_input();

        System.out.println("Enter the elemnets of matrix 2");
        m2.get_input();

        m3.matrix_mul(m1,m2);

        System.out.println("----------------------------------------------");
        System.out.println("The Matrix 1 is:");
        m1.print_matrix();

        System.out.println("----------------------------------------------");
        System.out.println("The Matrix 2 is:");
        m2.print_matrix();

        System.out.println("----------------------------------------------");
        System.out.println("The Multiplication of two matrices is:");
        m3.print_matrix();
    }
}
