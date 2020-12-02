package DataStructure;
//Fibonacci Series in Java without using recursion
import java.util.Scanner;
/*class FibonacciExample1
{  
public static void main(String args[])  
{    
 Scanner x=new Scanner(System.in);    
 int n1=0,n2=1,n3,i;
 System.out.println("Enter the number upto print Series = ");
// int count=x.nextInt(); 
 int count=100;
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print("\n "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  System.out.println();
}
}*/
class fibonacci 
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 50; 
    System.out.println(fib(n)); 
    } 
} 
