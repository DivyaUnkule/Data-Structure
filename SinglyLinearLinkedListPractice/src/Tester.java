import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			SinglyLinearLinkedList lst=new SinglyLinearLinkedList();
			while(!exit)
			{
				System.out.println("ENter your choice 1.insert 2.insert by position"
						+ "3.display 4.deleteByValue 5.DeleteByPosition "
						+ "6.Reverse using stack 7.reverse using recursion 0.exit");
				switch(sc.nextInt())
				{
				case 1://insert
					System.out.println("ENter data to insert");
					int data=sc.nextInt();
					boolean b=lst.insert(data);
					if(b)
					{
						System.out.println(data+" inserted successfully");
					}
					else
					{
						System.out.println(data+" is not inserted");
					}
					break;
				case 2://insert By position
					System.out.println("ENter data to insert");
					int data1=sc.nextInt();
					System.out.println("ENter position to insert data");
					int pos=sc.nextInt();
					boolean b1=lst.insertByPosition(data1,pos);
					if(b1)
					{
						System.out.println(data1+" at "+pos+" inserted successfully");
					}
					else
					{
						System.out.println(data1+" at "+pos+" not inserted");
					}
					break;
				case 3://display
					lst.display();
					break;
				case 4://delete By value
					System.out.println("ENter data to be deleted");
					int data2=sc.nextInt();
					boolean b3=lst.deleteByValue(data2);
					if(b3)
					{
						System.out.println(data2+" deleted successfully");
					}
					else
					{
						System.out.println(data2+" is not deleted");
					}
					
					break;
				case 5://Delete By Position
					System.out.println("ENter position to delete data");
					int pos5=sc.nextInt();
					boolean b5=lst.deleteByPosition(pos5);
					if(b5)
					{
						System.out.println("data deleted successfully at "+pos5+" position");
					}
					else
					{
						System.out.println("data is deleted successfully at "+pos5+" position");
					}
					break;
				case 6://Reverse Using Stack
					lst.reverseUsingStack();
					break;
				case 7://Reverse Using Recursion
					lst.reverseUsingRecursion(lst.getHead());
					break;
					
				case 0:
					exit=true;
					break;
				}
			}
		}

	}

}
