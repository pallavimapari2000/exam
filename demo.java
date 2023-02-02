class Node 
{
	int data;
	Node next;
	
	public Node(int data)
	{
			this.data = data;
			this.next = null;
			
	}
}
	
	class LinkList
	{
		Node head;
			public void insert(int data)
			{
				Node newNode = new Node(data);
				newNode.next = head;
				head = newNode;
				
			}
			
			public void display()
			{
				Node current = head;
				while(current!=null)
				{
					System.out.println(current.data+"");
					current=current.next;
					
				}
			}
			
			System.out.println();
			
			public static void main (String args[])
		{
			LinkList l1 = new LinkList();
			l1.insert(10);
			l1.insert(20);
			l1.insert(30);
			l1.insert(40);
			System.out.println("Linked List := ");
			l1.display();
		}
			
	}