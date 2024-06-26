import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			Stack s=new Stack(3);
			boolean exit=false;
			while(!false)
			{
				
		System.out.println("ENter Your Choice: 1.Push 2.Pop 3.Peek 0:Exit");
		
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("ENter number to push");
			int e=sc.nextInt();
			if(s.push(e))
			{
				System.out.println(e+" added successfully");
			}
			else
			{
				System.out.println("Stack is Full");
			}
			break;
		case 2:
			int ele=s.pop();
			if(ele!=-999)
			{
			System.out.println("Popped element: "+ele);
			}
			else
			{
				System.out.println("Stack is empty");
			}
			break;
		case 3:
			int ele1=s.peek();
			if(ele1!=-999)
			{
				System.out.println("Peek element: "+ele1);
			}
			else
			{
				System.out.println("Stack is empty");
			}
			
			break;
		
		case 0:
			exit=true;
			break;
		}
			}
		

	}
	}

}
