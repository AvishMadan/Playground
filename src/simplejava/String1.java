package simplejava;
import java.lang.*;



public class String1 {
	int count=1;
	public void StringPattern(java.lang.String string)
	{
	
		for (int i = 0; i <string.length(); i++) {
		if(string.charAt(i)>='A' && string.charAt(i)<='Z')
		{
			
					count++;
				
			
		}
		
			
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		
		String1  string=new String1();
		string.StringPattern("dataPatternJavaCodeQWER");
		
	}
}
