import java.util.Scanner;  
class example9_2   
{  
  public static void main(String args[])  
  {  
    int i, n, search, a[];  
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    a = new int[n];  
    System.out.println("Enter those " + n + " elements");  
    for (i = 0; i < n; i++) 
     { 
      a[i] = in.nextInt();  
     }
    System.out.println("Enter value to find");  
    search = in.nextInt();  
    for (i = 0; i < n; i++)  
    {  
      if (a[i] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (i+ 1) + ".");  
          break;  
      }  
   }  
   if (i == n)
    { 
     System.out.println(search + " is not present in array.");  
    }
  }  
}  