class bst{


static class Node{
int key;
Node left , right ;
Node(int key)
{
this.key=key;
left = right = null;
}
}

public Node add(Node root, int key)
{
if(root==null)
{
return new Node(key);
}
if(root.key > key )
{
root.left = add(root.left , key);
}
else if(root.key < key)
{
root.right = add(root.right , key);
}
return root;
}
static Node parent;
public Node Find(Node root , int key ){
	 if(root.key == key)
	 {   
		 return root;
	 }
		else if (root.key>key)
		{ 
				if(root.left!=null)
         		{
					parent =root;
					return Find(root.left , key);
				}
			}
			else if(root.key<key)
			{
				parent = root;
	        return Find(root.right,key);			
			}
	        return root;
}

public void traverse(Node root){
	if(root==null)
		return;
	traverse(root.left);
	System.out.print(root.key+" ");
	traverse(root.right);
	
}
public Node parent(Node root){
	return root;
}
/*public Node Next(Node n){
	if(n.right!=null)
		return leftdescendant(n.right);
	else
		return rightancestor(n);
}*/
public Node leftdescendant(Node node)
{
	if(node.left==null)
		return node;
	else
		return leftdescendant(node.left);
}
public Node rightancestor(Node root, int key)
{
	Find(root,key);
	if(key<parent.key)
	{
		return parent;
	}
	else
		return rightancestor(parent,key);
}

public static void main(String args[])
{
Node n1 = new Node(5); 
bst b = new bst();
Node n = new Node(10);
Node root =  b.add(n , 11);
root = b.add(root , 14);
root = b.add(root , 9 );
root = b.add(root,n1.key);
Node parent;
b.traverse(root);
System.out.println(" "+b.Find(root,14).key);
System.out.println(" Parent of 14 is = "+b.parent.key);
System.out.println(""+b.rightancestor(root,9).key);

}
}