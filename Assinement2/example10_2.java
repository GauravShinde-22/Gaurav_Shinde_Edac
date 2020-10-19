import java.util.Scanner;

class example10_2
{
 public static void main(String args[])
 { 
   Scanner x=new Scanner(System.in);
   int i,sum_ev=0,sum_od=0,sum=0,n;
   System.out.print("Enter size of array ");
   n=x.nextInt();
   int a[]=new int [n];
   System.out.println("Enter the array elements : ");
   for(i=0;i<5;i++)
   {
     a[i]=x.nextInt();
   }
   for(i=0;i<5;i++)
   {
      if(i%2==0)
      {
        sum_ev=sum_ev+a[i];
      }
      else 
      {
       sum_od=sum_od+a[i];
      }
   }
  System.out.println("Sum of even no : "+sum_ev);
  System.out.println("Odd of even no : "+sum_od);
 }
}