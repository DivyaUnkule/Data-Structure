import java.util.LinkedList;

public class SinglyLinearLinkedList {
	private Node head;
	
	public SinglyLinearLinkedList() {
		this.head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return true;
		}
		
		Node trav=head;
			while(trav.getNext()!=null)
			{
				trav=trav.getNext();
			}
			trav.setNext(newNode);
			
			return true;
	}
	public void display()
	{
		Node trav=head;
		while(trav!=null)
		{
			System.out.println(trav.getData());   
			trav=trav.getNext();
			
		}
		
	}
	public int binarySearch(int k)
	{
		int length=0;
	Node trav=head;
	while(trav!=null)
	{
		length++;   
		trav=trav.getNext();
		
	}
	int left=0;
	int right=length-1;
	trav=head;
	
	while(left<=right)
	{
		
		int mid=(left+right)/2;
		
		for(int i=left;i<mid;i++)
		{
			trav=trav.getNext();
		}
		if(trav.getData()==k)
		{
			return mid;
		}
		if(k<trav.getData())
		{
			right=mid-1;
			trav=head;
		}
		else
		{
			left=mid+1;
			trav=trav.getNext();
		}
		
		
	}
	return -1;
	}
	 public int countOfElements()
	    {
	    	int count=0;
	    	Node trav=head;
	    	while(trav!=null)
	    	{
	    		count++;
	    		trav=trav.getNext();
	    	}
	    	return count;
	    }
	   
	    public void removeDuplicates() {
	        Node trav = head;
	        while (trav != null) {
	            Node runner = trav;
	            while (runner.getNext() != null) {
	                if (trav.getData() == runner.getNext().getData()) {
	                    runner.setNext(runner.getNext().getNext());
	                } else {
	                    runner = runner.getNext();
	                }
	            }
	            trav = trav.getNext();
	        }

	        System.out.println("After removal of duplicates: ");
	        display();
	    }
	    
	    
	   public void sort() {
	        if (head == null) {
	            return;
	        }

	        Node trav = head;
	        while (trav != null) {
	            Node minNode = trav;
	            Node runner = trav.getNext();
	            while (runner != null) {
	                if (runner.getData() < minNode.getData()) {
	                    minNode = runner;
	                }
	                runner = runner.getNext();
	            }

	            // Swap data between trav and minNode
	            int temp = trav.getData();
	            trav.setData(minNode.getData());
	            minNode.setData(temp);

	            trav = trav.getNext();
	        }

	        System.out.println("After Sort: ");
	        display();
	    }
	   
	   public void maxAndMin()
	   {
		   
		   if(head==null)
		   {
			   return ;
		   }
		   Node trav=head;
		   int min=trav.getData();
		   int max=trav.getData();
		   
		   while(trav!=null)
		   {
			   //Node temp=trav;
			   if(trav.getData()<min)
			   {
				   min=trav.getData();
			   }
			   if(trav.getData()>max)
			   {
				   max=trav.getData();
			   }
			   trav=trav.getNext();
		   }
		   System.out.println("Min: "+min);
		   System.out.println("Max: "+max);
		   
	   }
	   
	    	

}
