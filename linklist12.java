//search function in link list.
package DataStructure.Linklist;
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
    public void display()
    {
        System.out.print(" "+data+" ");
    }
}
class linklist
{
    Node first;
    public linklist()
    {
        first=null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insert(int data)
    {
        Node nnode=new Node(data);
        nnode.next=first;
        first=nnode;
    }
    public void insert_last(int data)
    {
        Node new1;
        Node temp;
        new1=new Node(data);
        if(first==null)
        {
            new1.next=first;
            first=new1;
        }
        else
        {
            temp=first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new1;
            new1.next=null;
        }
    }
   /* public void insert_at(int data)
    {
        Node new12=new Node(data);
        Node temp1;
        int key;
        Scanner x=new Scanner(System.in);
        /*System.out.println("Enter the key after the elemrnt want");
        key=x.nextInt();
        if(first==null)
        {
            new12.next=first;
            first=new12;
        }
        else
        {
            System.out.println("Enter the key after the elemrnt want");
            key=x.nextInt();
            temp1=first;
            do
            {
               // temp1=first;
                if(temp1.data==key)
                {
                    new12.next=temp1.next;
                    temp1.next=new12;
                    temp1=temp1.next;
                
                  //  return 0;
                }
                else
                    temp1=temp1.next;
            }while(temp1.next != null);
        }
    }*/
    public Node InsertPos(int position, int data) { 
        Node head = first; 
        if (position < 1) 
            System.out.print("Invalid position"); 
        if (position == 1) { 
            Node newNode = new Node(data); 
            newNode.next = first; 
            head = newNode; 
        } else { 
            while (position-- != 0) { 
                if (position == 1) { 
                    Node newNode = new Node(data); 
                    newNode.next = first.next; 
                    first.next = newNode; 
                    break; 
                } 
                first = first.next; 
            } 
            if (position != 1) 
                System.out.print("Position out of range"); 
        } 
        return head; 
    } 
    public Node remove_first()
    {
        if(isEmpty())
        {
            System.out.println("list is Empty");
        }
            Node temp=first;
            first=first.next;
            return temp;
    }
    public Node remove_last()
    {
      if(isEmpty())
      {
          System.out.println("list is empty");
      }
      Node second_last = first; 
        while (second_last.next.next != null) 
            second_last = second_last.next; 
        second_last.next = null; 
        return first; 
    }
    void deleteNode(int position) //delete at position
    { 
        if (first == null) 
            return; 
        Node temp = first;  
        if (position == 0) 
        { 
            first = temp.next; 
            return; 
        } 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
        if (temp == null || temp.next == null) 
            return; 
        Node next = temp.next.next; 
        temp.next = next; 
    } 
    public void search(int key)
    {
        Node head=first;
        Node temp;
        int found;
        temp=head;
        if(temp==null)
        {
            System.out.println("Link is empty");
        }
        found=1;
        while(temp!=null && found==1)
        {
            if(temp.data != key)
            {
                temp=temp.next;
            }
            else
            {
                found=0;
            }
        }
        if(found==0)
            System.out.println(key+" Element present");
        else
            System.out.println(key+" Element not present");
    }
    public void display()
    {
        int count=0;
        Node current=first;
		while(current!=null)
                {
                     count++;
			current.display();
			current=current.next;
		}
		System.out.println();
                System.out.println("Number of node "+count);
    }
    public Node reverse()
    {
        Node temp1,temp2,temp3;
        temp1=first;
        if(temp1==null)
            System.out.println("list is Empty");
        else
        {
            temp2=null;
            while(temp1!=null)
            {
                temp3=temp2;
                temp2=temp1;
                temp1=temp1.next;
                temp2.next=temp3;
            }
            first=temp2;
        }
        return temp1;
    }
}
class linklist12
{
    public static void main(String args[])
    {
                Scanner scan=new Scanner(System.in);
		linklist l1=new linklist();		
		while(true)
                {
			System.out.println("1.Insert\n2.Insert last\n3.Insert At Position\n4.Delete First Node\n5.Delete last node\n6.Delete at position\n7.display\n8.Search\n9.Reverse List\n10.Exit");
			System.out.println("Enter your choice:");
			int ch=scan.nextInt();
                        switch(ch)
                        {
			case 1:	
                                System.out.println("Enter Node Data");
                                int i;
				i=scan.nextInt();
				l1.insert(i);
				break;
                        case 2:
                              System.out.println("Enter the data");
                              int key;
                              key=scan.nextInt();
                              l1.insert_last(key);
                              break;
                        case 3:
                            System.out.println("Enter the Data");
                            int i1,d;
                            i1=scan.nextInt();
                            System.out.println("Position");
                            d=scan.nextInt();
                            //System.out.println("Enter the key after the elemrnt want");
                            //int key2;
                            //key2=scan.nextInt();
                            //l1.insert_at(i1);
                            l1.InsertPos(d,i1);
                            break;
			case 4:	l1.remove_first();
				break;
                        case 5:l1.remove_last();
                               break;
                        case 6:
                            System.out.println("Enter Position");
                            int k=scan.nextInt();
                            l1.deleteNode(k);
                            break;
			case 7:	System.out.println("Display LinkList");
                                l1.display();
				break;
                        case 8:
                               int key1;
                               System.out.println("Enter data you want search");
                               key1=scan.nextInt();
                               l1.search(key1);
                               break;
                        case 9:
                            l1.reverse();
                            break;
                        case 10:
                             System.exit(0);
			default:System.out.println("Wrong choice");
				//System.exit(0);
			}
		}		
    }
}