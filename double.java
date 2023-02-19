class double1{
Node head;
class Node{
int data;
Node next;
Node prev;
Node(int data)
{
this.data=data;
this.next=null;
this.prev=null;
}
}
public void Add(int data){
Node n = new Node(data);
if(head==null)
{
head=n;
}
else
{
Node cur = head;
while(cur.next!=null)
{
cur=cur.next;
}
cur.next=n;
n.prev=cur;
}
}
public void display(){
Node cur = head;
while(cur!=null)
{
System.out.print(cur.data+" ");
cur=cur.next;
}
}
public static void main(String args[])
{
double d = new d();
d.Add(10);
d.Add(20);
d.Add(30);
d.display();

}
}