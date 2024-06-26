
public class CircularLinkedList {

	private Node head;
	 public CircularLinkedList()
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
			newNode.setNext(head);
			return true;
		}
		
		else
		{
			Node trav=head;
			while(trav.getNext()!=head)
			{
				trav=trav.getNext();
			}
			newNode.setNext(head);
			trav.setNext(newNode);
			return true;
		}
	}
	
	public boolean insertByPosition(int data,int pos)
	{
       Node newNode=new Node(data);
		
		if(newNode==null)
		{
			return false;
		}
		if((head==null && pos>1)||pos==0)
		{
			
			return false;
		}
		if(pos==1)
		{
			if (head == null) {
	            head = newNode;
	            newNode.setNext(head);
			}
			newNode.setNext(head);
			Node trav=head;
			while(trav.getNext()!=head)
			{
				trav=trav.getNext();
			}
			trav.setNext(newNode);
			head=newNode;
			return true;
		}
		else
		{
			Node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				 if (trav.getNext() == head) {
		                return false; 
		            }
				trav=trav.getNext();
			}
			newNode.setNext(trav.getNext());
			trav.setNext(newNode);
			return true;
		}
		
	}
	public void display()
	{
		if (head == null) {
            return;
        }
		Node trav=head;
		do
		{
			System.out.println(trav.getData());
			trav=trav.getNext();
		}while(trav!=head);
		
	}
	public boolean deleteByValue(int data)
	{
		if(head==null)
		{
			return false;
		}
		
		else
		{
			Node trav=head;
			
			if(trav.getData()==data && trav==head)
				{
					if (head.getNext() == head) {
		                head = null;
		                return true;
		            }

					head=trav.getNext();
					Node t=head;
					while(t.getNext()!=head)
					{
						t=t.getNext();
					}
					t.setNext(head);
					return true;
					  

				}
				 Node prev = head, del = head;
			        while (del.getData() != data) {
			            prev = del;
			            del = del.getNext();
			            if (del == head) {
			                return false;
			            }
			        }

			        prev.setNext(del.getNext());
			        return true;
				
			
			
			
		}
	}
	
}
