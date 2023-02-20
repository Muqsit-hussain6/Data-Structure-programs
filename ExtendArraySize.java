class list
{
	static int a[]=new int[1];
	static int ctr=0,capacity=1;

public static void insert(int data)
{
	if(ctr==capacity)
	{
	increaseSize();
    }
    a[ctr]=data;
    ctr++;
}

public static void increaseSize()
{
        int b[]=null;
        if(ctr==capacity)
		{
            b=new int[capacity*2];
            for(int i=0;i<capacity;i++)
			{
                b[i]=a[i];
            }
        }
        a=b;
        capacity=capacity*2;
}

public static void display()
{
	for(int i=0;i<capacity;i++)
		System.out.print(a[i]+" ");
}

public static void main(String args[])
{
	list.insert(10);
	list.insert(50);
	list.insert(40);
	list.insert(30);
	list.insert(90);
	list.insert(192);
	list.insert(169);
	list.insert(133);
	list.insert(75);
	list.display();
}

}