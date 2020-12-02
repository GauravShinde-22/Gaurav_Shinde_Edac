package DataStructure.Linklist;
import java.util.Scanner;
class Link 
{
	public int iData;	
	public Link next;	
	public Link(int id)
        {
		iData=id;	
	}	
	public void displayLink()
        {		
		System.out.print(" "+iData);
	}	
}

class LinkList 
{
	private Link first;
	public LinkList()
        {
		first=null;
	}	
	public boolean isEmpty()
        {
		return (first==null);
	}	
	public void insertFirst(int id)
        {
		Link newLink=new Link(id);
		newLink.next=first;
		first=newLink;
	}	
	public Link deleteFirst()
        {
		Link temp=first;
		first=first.next;
		return temp;
	}	
	public void display()
        {		
		Link current=first;
		while(current!=null)
                {
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
}

public class linklist1
{
	public static void main(String[] args) 
        {
		Scanner scan=new Scanner(System.in);
		LinkList l1=new LinkList();		
		while(true)
                {
			System.out.println("1.Insert\n2.delete\n3.display\n4.exit");
			System.out.println("Enter your choice:");
			int ch=scan.nextInt();
                        switch(ch)
                        {
			case 1:	int i;
				i=scan.nextInt();
				l1.insertFirst(i);
				break;
			case 2:	l1.deleteFirst();
				break;
			case 3:	System.out.println("Display LinkList");
                                l1.display();
				break;
                        case 4:
                             System.exit(0);
			default:System.out.println("Wrong choice");
				System.exit(0);
			}
		}		
	}
}
