package DataStructure;
import java.util.Scanner;
class cirque
{
    int q[];
    int size;
    int front=-1;
    int rear=0;
     
    public cirque(int n)
    {
        q =new int[n];
        size=n;
    }
    public boolean qFull()
    {
        if(front==(rear+1)%size)
            return true;
        else
            return false;
    }
    public boolean qEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public void add(int item)
    {
        if(qFull())
        {
            System.out.println("The Circular queue is full");
        } 
        else
        {
            if(front==-1)
                front=rear=0;
            else
                rear=(rear+1)%size;
            q[rear]=item;
        }
    }
    public void delete()
    {
        int item;
        if(qEmpty())
            System.out.println("Queue is Empty");
        else
        {
            item=q[front];
            if(front==rear)
            {
                front=rear=-1;
            }
            else
                front=(front+1)%size;
            System.out.println("The Deleted Element "+item);
        }
    }
    public void display()
    {
        int i;
        if(qEmpty())
        {
            System.out.println("Queue is Empty ");
            return;
        }
        i=front;
        while(i!=rear)
        {
            System.out.println(q[i]);
            i=(i+1)%size;
        }
       System.out.println(q[i]);
    }
    public static void main(String args[])
    {
        int n,ch,item;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Size");
        n=x.nextInt();
        cirque cq=new cirque(n);
        do
        {
            System.out.println("Menu Driven");
			System.out.println("\n1.Enter element in queue \n2.Delete elemrnt from queuq \n3.Print Queue\n4.Exit");
			System.out.println("Enter your choice ");
			ch=x.nextInt();
			switch(ch)
			{
                            case 1:
                                  System.out.println("Enter the elemrnt in queue ");
                                  item=x.nextInt();
                                  cq.add(item);
                                  break;
                            case 2:
                                  cq.delete();
                                  break;
                            case 3:
                                  System.out.println("Circular Queue Contain ");
                                  cq.display();
                                  break;
                            case 4:
                                 System.exit(0);
                            default :
                                System.out.println("Wrong Choice ");
                        }
        }while(true);
    }
}