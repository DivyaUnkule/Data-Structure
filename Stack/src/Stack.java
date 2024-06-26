import java.util.Arrays;

public class Stack {
	private final int size;
	private int[] arr;
	private int top;
	public Stack(int size) {
		this.size=size;
		this.arr=new int[size];
		top=-1;
	}
	
	public boolean push(int data)
	{
		if(!isFull())
		{
		arr[++top]=data;
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
		return arr[top--];
		}
		return -999;
		
	}
	public int peek()
	{
		if(!isEmpty())
		{
		return arr[top];
		}
		return -999;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	

}
