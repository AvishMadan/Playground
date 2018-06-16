package simplejava;

public class SecondMAx {
	public static void main(String[] args) {
		
	
	int arr[]={3,7,3,4,1};
	int temp;
	for(int i=0;i<arr.length;i++)
	{
	for(int j=0;j<arr.length-1;j++)
	{
		if(arr[j]>arr[j+1])
		{
			temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
	}
	for(int i=arr.length-1;i>0;i--)
	{
		if(arr[i]>arr[i-1])
		{
		System.out.println(arr[i-1]);
		break;
		}
	}
	}
}
