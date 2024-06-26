import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int k)
	{
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			
			if(k==arr[mid])
			{
				return mid;
			}
			
			if(k<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[];
		
		arr=new int[]{10,35,46,78,2,30,90,24,13,28};
		Arrays.sort(arr);
		
		int key=10;
		
		int index=binarySearch(arr,key);
		
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
