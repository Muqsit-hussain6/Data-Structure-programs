class CompleteTree{
int arr[];
int Maxsize,size; 
 CompleteTree(int maxsize){
  size=0;
  this.
  Maxsize=maxsize; 
  arr = new int [maxsize];
 }
 public void insert(int element){
	 if(size==Maxsize)
		 System.out.println("Over-flow");
	 else
	 {
        size++;
		arr[size]=element;
        Siftup(size);
	 }
 }
public int Parent(int index){
	return index/2;
}
public int leftchild(int index)
{
	return 2*index;	
}
public int rightchild(int index)
{
	return 2*index+1;
}
public void Siftup(int index){
    int temp=0;
    while(index>1 && arr[index/2]<arr[index])
	{
		temp = arr[index/2];
		arr[index/2]=arr[index];
		arr[index]=temp;
		index = index/2;
	}		
}
public void Siftdown(int index){
int temp=0;	
int maxIndex = index;
int l = (2*index);
if (l <= size && arr[l] > arr[maxIndex])
{ 
maxIndex =l;
}
  int r = (2*index)+1;
   if (r <= size && arr[r] > arr[maxIndex])
   maxIndex =r;
  if (index != maxIndex)
 {
	temp = arr[index];
	arr[index] = arr[maxIndex];
	arr[maxIndex]=temp;
    Siftdown(maxIndex);
 }	
}
public int ExtractMax(){
	int result = arr[1];
	arr[1]=arr[size];
	size--;
	Siftdown(1);
	return result;
}
public void Remove(int index){
	arr[index]=Integer.MAX_VALUE;
	Siftup(index);
	ExtractMax();
}
public void changeP(int index , int data){
	int oldp= arr[index];
	arr[index] = data;
	if (data > oldp)
	{
		Siftup(index);
	}
	else 
		Siftdown(index);
	
	
}
public void display(){
	for(int i = 1 ; i <=size ;i++)
		System.out.print(" "+arr[i]);
}
public void inorder(int index){
	if(index>size)
	return ;
    inorder(leftchild(index));
	System.out.print(" "+arr[index]);
	inorder(rightchild(index));
}
public void preorder(int index){
	if(index>size)
	return ;
	System.out.print(" "+arr[index]);
    preorder(leftchild(index));
	preorder(rightchild(index));
}
public void postorder(int index){
	if(index>size)
	return ;

    postorder(leftchild(index));
	postorder(rightchild(index));
	System.out.print(" "+arr[index]);
}
public static void main(String args[]){
  CompleteTree a = new CompleteTree(13);
  a.insert(42);
  a.insert(29);
  a.insert(18);
  a.insert(14);
  a.insert(7);
  a.insert(18);
  a.insert(12);
  a.insert(11);
  a.insert(5);
  
  System.out.println();
  a.display();
  
  
  System.out.println();
  a.inorder(4);

}
}