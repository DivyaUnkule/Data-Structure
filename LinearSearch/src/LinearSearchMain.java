
public class LinearSearchMain {
	public static int linearSearch(int arr[],int k)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(k == arr[i])
			{
				return  i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]=new int[]{10,35,46,78,25,30,90,24,13,28};
		
		int key=10;
		
		int index=linearSearch(arr,key);
		if(index != -1)
		{
		System.out.println(key+" is found at "+(index+1)+" position");
		}
		else
		{
		System.out.println("Key is not found");
		}
	}

}
