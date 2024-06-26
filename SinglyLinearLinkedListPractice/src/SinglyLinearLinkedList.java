import java.util.Stack;

public class SinglyLinearLinkedList {

	private Node head;
	
	public SinglyLinearLinkedList()
	{
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
		if(newNode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=newNode;
			return true;
		}
		else
		{
			Node trav=head;
			while(trav.getNext()!=null)
			{
				trav=trav.getNext();
			}
			trav.setNext(newNode);
			return true;
		}
		
		
		
	}
	public boolean insertByPosition(int data,int pos)
	{
		Node newNode=new Node(data);
		
		if((head==null && pos>1) || (pos<=0) )
		{
			return false;
		}
		if(head==null && pos==1)
		{
			head=newNode;
			return true;
		}
		if(pos==1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		
		if(pos!=1)
		{
			Node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.getNext();
				if(trav==null)
				{
					return false;
				}
			}
			newNode.setNext( trav.getNext());
			trav.setNext(newNode);
			return true;
		}
		return false;
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
	public boolean deleteByValue(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if(head==null)
		{
			return false;
		}
		else
		{
			Node trav=head;
			while(trav.getNext()!=null)
			{
				if(data==trav.getData()&&trav==head)
				{
						head=trav.getNext();
						return true;
				}	
			   else {
				   if(trav.getNext().getData()==data)
				   {
						trav.setNext(trav.getNext().getNext());
						return true;
				   }
				  
				   
			   }
				trav=trav.getNext();
				
			}
			trav.setNext(newNode);
			return true;
		}
		
		
	}
	public boolean deleteByPosition(int pos)
	{
		if((head==null && pos>1)|| pos<=0)
		{
			return false;
		}
		if(pos==1)
		{
			head=head.getNext();
			return true;
		}
		else
		{
		Node trav=head;
		for(int i=1;i<pos-1;i++)
		{
			trav=trav.getNext();
		}
		trav.setNext(trav.getNext().getNext());
		
		return true;
		}
	}
	public void reverseUsingStack()
	{
		Stack<Node>st=new Stack<>();
		
		Node trav=head;
		while(trav!=null)
		{
			st.push(trav);
			trav=trav.getNext();
		}
		
		while(!st.empty())
		{
		System.out.println(st.pop().getData());
		}
	}
	public void reverseUsingRecursion(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		reverseUsingRecursion(trav.getNext());
		System.out.println(trav.getData());
	}
}
