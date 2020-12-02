package DataStructure;
import java.util.*;
class Binarytree
{
	static class Node 
	{ 
		int key; 
		Node left, right; 
	}

	static Node newNode(int data) 
	{ 
		Node temp = new Node(); 
		temp.key = data;
		temp.left = null; 
		temp.right = null;
		return temp; 
	}

	static Node insert(Node root, int key) 
	{
		Node newnode = newNode(key);
		Node x = root;
		Node y = null; 
	   
		while (x != null) 
		{ 
			y = x; 
			if (key < x.key) 
				x = x.left; 
			else
				x = x.right; 
		}
		
		if (y == null) 
			y = newnode;
		else if (key < y.key) 
			y.left = newnode;
		else
			y.right = newnode;
		return y; 
	} 
        static Node Search(Node root,int key)
        {
            Node temp;
            temp=root;
            while(temp!=null)
            {
                if(temp.key==key)
                {
                    System.out.println("Element is present");
                    return temp;
                }
                if(temp.key>key)
                    temp=temp.left;
                else
                    temp=temp.right;
            }
            return temp;
        }
        static Node Delete(Node root,int key)
        {
            Node temp,par,temp1;
            temp=Search(root,key);
            if(temp.left!=null && temp.right!=null)
            {
                par=temp;
                temp1=temp.right;
                while(temp1.left!=null)
                {
                    par=temp1;
                    temp1=temp1.left;
                }
                temp.key=temp1.key;
                par.right=null;
            }
            if(temp.left!=null && temp.right==null)
            {
                par=temp;
                if(par.left==temp)
                    par.left=temp.left;
                else
                    par.right=temp.left;
                temp=null;   
            }
            if(temp.left)
        }    
}