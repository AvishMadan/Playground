package simplejava;

public class fabonaci {
int secondLast=0;
	int last=1;
	int number;
public void fabo(int num)

{

	for(int i=0;i<=num;i++)
	{
		System.out.print(secondLast+ " ");
		number=last+secondLast;
		secondLast=last;
		last=number;
		/*if(i==1)
		{
			System.out.print("1"+" ");
		}
*/
	}



}
	
	
	
	public static void main(String[] args) {
		
		fabonaci fabonaci=new fabonaci();
		fabonaci.fabo(10);
	}

}
