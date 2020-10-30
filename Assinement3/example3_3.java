import java.util.Scanner;

class example3_3
{
 public static void main(String args[])
 { 
   Scanner x=new Scanner(System.in);
   int i,n,s;
   System.out.print("Enter size of array ");
   n=x.nextInt();
   int a[]=new int [n];
   int sum[]=new int [n];
  /* System.out.println("Enter the array elements : ");
   for(i=0;i<n;i++)
   {
     a[i]=x.nextInt();
   }*/
   for(i=1;i<=n;i++)
   {
      if(i%2==0)
      {
           s=i*i;
           System.out.print(s+" ");
      }
      else 
      {
          s=i*i*i;
          System.out.print(s+" ");
      }
    }
  /*for(i=1;i<=n;i++)
  {
   System.out.print(" "+sum[i]);
  }*/
 }
}