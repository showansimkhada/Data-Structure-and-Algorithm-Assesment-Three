package assignment3;

public class TQueue 
{
	QNode head;
	QNode tail;
	// creating the TQueue constructor
	TQueue()
	{
		head = null;
		tail = null;
	}
		
	public void addToTail(QNode nd)
	{
		// if TQueue is empty then QNode is head
		if(isEmpty())
		{
			head = nd;
		}
		else
		{
			tail.next = nd;
		}
		tail = nd;
	}
	
	public QNode deleteFromHead()
	{
		// assuming the temp as the head node
		QNode temp = head;
		if(isEmpty())
		{
			return null;
		}
		if(head.next == null)
		{
			head = null;
			return temp;
		}
		head = head.next;
		return temp;
	}
	
	public int size()
	{
		int num = 0;
		QNode current = head;
		while (current != null)
		{
			num++;
			current = current.next;
		}
		return(num);
	}
	
	public boolean isEmpty()
	{
		// checking the queue is empty or not
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
