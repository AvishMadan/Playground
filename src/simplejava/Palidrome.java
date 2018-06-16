package simplejava;

public class Palidrome {
int num2;
int rev=0;
int num1;


public void data(int num)
{	num1=num;
	for (int i = 0; num1>0 ; i++) {
		
int rem=num1%10;
rev=rev*10+rem;
		
	num1=num1/10;

	}
	if (num==rev)
	{
		
		System.out.println("palidrome");
	}
	else
	
	{
		System.out.println("not palidrome");
	}
}

	public static void main(String[] args) {
		
Palidrome palidrome=new Palidrome();
palidrome.data(12421);
	}}