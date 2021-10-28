/*
To sort an array elements using bubble sort algorithm.
*/
import java.util.Scanner;
class bubsort
{
	public static void main(String args[])
	{
		int n,i,j,temp;
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
						{
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
			}
		}
		System.out.println("sorted elements are\n");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

