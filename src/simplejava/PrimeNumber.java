package simplejava;

import java.util.Scanner;

public class PrimeNumber {

	
	int num1;
	int num2;
	int count=0;
int rem=0;
int sum=0;
	public void Armstrong(int num)
	{num1=num;
		while(num1>0)
		{
		
		count++;
		num1=num1/10;
			
		}
		System.out.println(count);
	}
	public void Armstrong1(int num)
	{num2=num;
	while (num2>0)	{
		rem=num2%10;
		System.out.println(rem+"reminder");
		System.out.println(count+"count");
		System.out.println(Math.pow(2, 3));
		sum=(int) (sum+(Math.pow(rem, count)));
		System.out.println(sum);
	num2=num2/10;
	}
	//System.out.println(sum);
	System.out.println(num);
	if(sum==num)
	{
	System.out.println("palidrome");	
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();*/
		
		//System.out.println("Enter your num"+":"+num);

		
		
		PrimeNumber number=new PrimeNumber();
		number.Armstrong(371);
	
		
		number.Armstrong1(371);
	
	}

}
