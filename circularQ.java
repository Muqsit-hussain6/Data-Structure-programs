class circularQ
{
int front =-1;
int rear = -1;
int arr[]= new int[5];

public Boolean isfull(){
if((rear+1)%5==front)
{
return true;
}
else
return false;
}

public boolean isempty(){
if(front ==-1 && rear==-1 )
return true;
else
return false;
}

public void enqueue(int data){
if(isfull()){
System.out.println("The queue is full");
}
else if(isempty()) 
{
front = rear = 0;
}
else
rear=(rear+1)%5;
arr[rear]=data;
}
public void dequeue(){
if(isempty())
{
System.out.println("The queue is empty");
}
else if(front==rear)
{
front=rear=-1;
}
else
front= (front+1)%5;
}
public void minus(){
	int temp=0;
	int min=arr[front];
	int index=front;
	int save=0;
	for(int i=index;i<5;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
			save=i;
		}
	}
	for(int i=index;i<5;i++)
	{
		arr[i]=arr[i]-min;
	}
	while(save>0)
	{
		temp=arr[save];
		arr[save]=arr[save-1];
		arr[save-1]=temp;
		save--;
	}
	System.out.println();
	for(int j=front;j<5;j++)
	System.out.print(arr[j]+" ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	save=0;

}

public void display(){
	System.out.println();
	for(int i=front;i<5;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}
public int front(){
	return front;
}


public static void main(String args [])
{
circularQ a = new circularQ();
a.enqueue(8);
a.enqueue(10);
a.enqueue(3);
a.enqueue(4);
a.enqueue(7);
a.display();
a.minus();
a.dequeue();
a.display();
a.minus();
a.dequeue();
a.display();
}
}
