import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
		
		SinglyLinearLinkedList lst=new SinglyLinearLinkedList();
		//LinkedList <Integer>l=new LinkedList<>();
	 /*   lst.insert(10);
		lst.insert(20);
		lst.insert(30);
		lst.insert(40);
		lst.insert(50);
		lst.insert(60);
		lst.insert(70);
		lst.insert(80);
		lst.insert(90);*/
		
		 lst.insert(50);
			lst.insert(20);
			lst.insert(10);
			lst.insert(40);
			lst.insert(30);
			
		
		lst.display();
		//lst.sort();
		lst.maxAndMin();
		/*int key = 100;
		int index = lst.binarySearch(key);
		if(index != -1)
		{
		System.out.println(key+" is found at "+(index+1)+" position");
		}
		else
		{
		System.out.println("Key is not found");
		}*/
		//l.forEach(p->System.out.println(p));
		
	}

}
