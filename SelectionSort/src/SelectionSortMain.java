import java.util.Arrays;

public class SelectionSortMain {

	public static int[] selectionSort(int[] arr)
	{
		int iteration=0;
		int comparison=0;
		for(int i=0;i<arr.length-1;i++)
		{ iteration++;
			for(int j=i;j<arr.length;j++)
			{
				comparison++;
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Itr: "+iteration+"Com: "+comparison);
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {10,5,9,20,15,67,50,83,100,95};
		int arr1[]=selectionSort(arr);
		System.out.println(Arrays.toString(arr1));

	}

}
