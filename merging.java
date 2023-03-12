class LinkedList
{
	Node head;
	int arr[];
	static class Node
	{
		Node next;
		int data;
		Node(int data)
	{
		this.next=null;
		this.data=data;
	}
	}
	
	
	void InsertEnd(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
		head=n;	
		}
		else
		{
			Node cur=head;
			while(cur.next!=null)
				cur=cur.next;
			
			cur.next=n;
		}
	}
	
	public void mergee()
{
	int size=0;int p=0;int sum=0;
	Node cur=head;
	while(cur.next!=null)
	{
		if(cur.data==0)
			size++;
		cur=cur.next;
	}
	arr=new int[size];
	Node temp=head.next;
	
	while(temp!=null)
	{
	if(temp.data!=0)
	{
	sum=sum+temp.data;
	}
	else
	{
	arr[p]=sum;
	p++;
	sum=0;
	}

	temp=temp.next;
	}
	
	for(int i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}




}

	public void merge()
	{
	int sum=0;int p=0;int size=0;
	
	Node cur=head;
	while(cur.next!=null)
	{
		if(cur.data==0)
			size++;	
			cur=cur.next;
	}
	System.out.println(size);
	int[] a=new int[size];
	
	cur=head.next;
	while(cur!=null)
	{
		if(cur.data==0)
		{
			a[p++]=sum;
			cur=cur.next;
			sum=0;
		}
		else
		{
			sum=sum+cur.data;
			cur=cur.next;
		}
	
	}
	
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]+"  ");
	}
	
	
	
	
}
	







}
	
	class merging
	{
	public static void main(String[] args)
	{
	LinkedList g=new LinkedList();
	g.InsertEnd(0);
	g.InsertEnd(3);
	g.InsertEnd(1);
	g.InsertEnd(0);
	g.InsertEnd(4);
	g.InsertEnd(5);
	g.InsertEnd(0);
	
	//g.merge();
	g.mergee();
	}
	}