package dataStructure;
import java.util.*;

class Stack123 {
	int top;
	int max=5;
	int arr[]=new int[max];
	boolean isEmpty() {
		return (top<0);
	}
	Stack123(){
		top=-1;
	}
	
	boolean push(Scanner sc) {
		if(top==max-1) {
			System.out.println("overflow!!!");
		return false;
		}
		else {
			System.out.println("Enter value");
			int val=sc.nextInt();
			top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
		}
	}
	
	boolean pop ()  
    {         
		if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }
	void Display() {
		System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--){  
            System.out.println(arr[i]);  
        }  
	}
}

class bracketmatch{
	public static void main(String args[]) {
		int choice=0;
		//Scanner sc=new Scan
                Scanner sc=new Scanner(System.in);
		Stack123 s=new Stack123();
		while(choice!=4) {
			System.out.println("choose one fropm the below option");
			System.out.println("\n1.Push\n2.Pop\n3.Show\n4..Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				s.push(sc);
				break;
			}
			case 2:{
				s.pop();
				break;
			}
			case 3:{
				s.Display();
				break;
			}
			case 4:{
				 System.out.println("Exiting....");  
	             System.exit(0);  
	             break;  
			}
			default:
				System.out.println("Please Enter valid choice ");  
				
			}
		}
	}
}
