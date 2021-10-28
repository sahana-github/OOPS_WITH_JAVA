/*

Create a Personal class to hold the personal details of an person such as name, age, education, salary-
(0basic, da, hra), years of experience, number of loans and loan amount. Write constructors to assign
values to the data members. Include an
a. isEligible() method to indicate whether the person is eligible for loan,
b. taxPay() method to indicate the amount of tax to be paid,
c. isEligiblePromotion() to indicate whether the person is eligible for a promotion.
d. Display () method to display the details.
Enter the details of n employees and indicate their eligibility and the tax to be paid.

*/

import java.util.Scanner;
class person
{
	static String name,edu;
	static int age,yoexp,no_of_loans;
	static float salary,basic,da,hra,loanamnt;
	person(String name,int age,int yoexp,String edu,int no_of_loans,float salary,float loanamnt)
	{
		this.name=name;
		this.age=age;
		this.yoexp=yoexp;
		this.edu=edu;
		this.no_of_loans=no_of_loans;
		this.salary=salary;
		this.loanamnt=loanamnt;
	}
	void iseligible()
	{
		if (no_of_loans>3 || loanamnt>=100000)
			System.out.println("not eligible");
		else
			System.out.println("eligible");
	}
	void taxpay()
	{
		if(salary>50000)
		{
			System.out.println("pay 2% of tax");
			float tax=2*salary/100;
 			System.out.println("tax paid is="+tax);
		}
		else
			System.out.println("no need to pay the tax");
	}
	void iseligiblepromotion()
	{
		if(yoexp>=5)
			System.out.println("eligible for promotion");
		else
			System.out.println("not eligible");
	}
	void display()
	{
		float da=45*salary/100;
		float hra=30*salary/100;
		System.out.println("your details:");
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("edu="+edu);
		System.out.println("salary="+salary);
		System.out.println("da="+da);
		System.out.println("hra="+hra);
		System.out.println("years of experience="+yoexp);
		System.out.println("no of loans="+no_of_loans);
		System.out.println("loanamnt="+loanamnt);
	}
	public static void main(String args[])
	{
		int n,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
	        n=sc.nextInt();
		person []p=new person[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter name");
			name=sc.next();
			System.out.println("enter age");
			age=sc.nextInt();
			System.out.println("enter years of experience");
			yoexp=sc.nextInt();
			System.out.println("enter education");
			edu=sc.next();
			System.out.println("enter salary");
			salary=sc.nextFloat();
			System.out.println("enter no of loans:");
			no_of_loans=sc.nextInt();
			System.out.println("enter loan amount");
			loanamnt=sc.nextFloat();

			p[i]=new person(name,age,yoexp,edu,no_of_loans,salary,loanamnt);
			p[i].iseligible();
			p[i].taxpay();
			p[i].iseligiblepromotion();
			p[i].display();
		}
	}
}






