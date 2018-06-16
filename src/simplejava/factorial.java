package simplejava;

public class factorial {
	int fact=1;
	int n=1;
	int num1=1;
	
	
	public void fact(int num)
	{num1=num;
		for(int i=0;i<num-1;i++){
			
		 fact=num1*fact;
		
		num1=num1-1;
		
		
		
		
	}
		System.out.println(fact);
		}

	public static void main(String[] args) {

		factorial factorial=new factorial();
		factorial.fact(7
				);

	}

}
