import java.util.Arrays;

public class BubbleSortMain {

	public static int[] bubbleSort(int[]arr)
	{
		int iteration=0;
		int comparison=0;
		for(int j=0;j<arr.length-1;j++)
		{
			iteration++;
		for(int i=0;i<arr.length-1-j;i++)
		{
			comparison++;
			int pos=i;
			if(arr[pos]>arr[pos+1])
			{
				int temp=arr[pos];
				arr[pos]=arr[pos+1];
				arr[pos+1]=temp;
						
			}
		}
		}
		System.out.println("Itr: "+iteration+"Com: "+comparison);
		return  arr;
	}
	public static void main(String[] args) {
		int arr[]= {10,5,9,20,15,67,50,83,100,95};
		int arr1[]=bubbleSort(arr);
		System.out.println(Arrays.toString(arr1));

	}

}
