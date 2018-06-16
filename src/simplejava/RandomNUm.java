package simplejava;

import java.util.Random;

/**
@author Avish Madan
@category POJO
@since 1.0
**/

public class RandomNUm {

	
	public static void main(String[] args) {
		
		int max=100;
		int min=0;
		Random random=new Random()
				
				;
		for(int i=0;i<20;i++){
		int num=min+random.nextInt(max);
		
		System.out.println(num);
		
		}
		
		
	}
}
