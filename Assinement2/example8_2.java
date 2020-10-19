import java.util.Scanner;
class example8_2
{
 public static void main(String args[])
 {
   int i,j,n;
   Scanner x=new Scanner(System.in);
  // int a[]=new int[n];
   System.out.print("\n Enter the array size = ");
   n=x.nextInt();
   int a[]=new int[n];
   for(i=0 ; i < n ; i++)
   {
    System.out.print("\n Enter the Array Element = ");
    a[i]=x.nextInt();
   }
   System.out.print(" Arrey elemrnt are ");
   for(i=0;i<n;i++)
   {
    System.out.print(a[i]+" ");
   }
   System.out.print("\n Arrey element in reverse order ");
   for(i=n-1 ; i >= 0 ; i--)
   {
     System.out.print(a[i]+" ");
   }
    
 }
}
