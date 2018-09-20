package selenium;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		//evenNumber();
		oddNumber();
		/*//given number is even or odd
		int n=10;
		if(n%2==0)
		{
			System.out.println("even number");
			
		}
		else
		{
			System.out.println("odd number");
		}*/
	}
	
	
		
//even numbers display in runtime through keyboard

	private static void evenNumber()
	{
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("the even number "+num+" are");
int nextEven=2;
for(int i=1; i<=num;i++)
{
	System.out.println(nextEven);
 nextEven=nextEven+2;
 //System.out.println("even number"  );
}
	}
	
	
	//odd numbers display in runtime through keyboard
	
	private static void oddNumber()
	{
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("the even number "+num+" are");
int nextEven=1;
for(int i=1; i<=num;i++)
{
	System.out.println(nextEven);
 nextEven=nextEven+2;
 //System.out.println("even number"  );
}
	}
	}


