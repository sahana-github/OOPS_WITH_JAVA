/*
Define a Stack class to implement the stack data structure. Include constructors to perform
initialization, method push to push an element into the stack, method pop to remove an
element from the stack and display method to display the elements of the stack.
*/
import java.util.Scanner;
class Stack
{
	int stk[];
	static int item,top;
	 stack(int size)
	{
		stk=new int[size];
	
		top=-1;
	}
	void push(int item)
	{
		if(top==9)
			System.out.println("stack overflow");
		else
			stk[++top]=item;
	}
	void pop()
	{
		if(top==-1)
			System.out.println("stack is empty");
		else
		{
			item=stk[top--];
		}
		System.out.println("popped item is"+stk[top]);
	}
	void display()
	{
		int i;
		if(top==-1)
			System.out.println("stack is empty");
		else
		{
			System.out.println("stack elements are");
			for(i=0;i<=top;i++)
				System.out.println(+stk[i]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stack ob=new stack(10);
		while(1)
		{
			System.out.println("enter your choice");
			System.out.println("1:push,2:pop,3:display,4:exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("enter the item to be pushed");
					item=sc.nextInt();
					ob.push(item);
					break;
				case 2:
					ob.pop();
					break;
				case 3:
					ob.display();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("invalid code");
					break;
			}
		}
	}
}



