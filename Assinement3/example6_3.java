import java.util.Scanner;
class example6_3
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n,i,temp,j;
    System.out.print("\n Enter Size of Array = ");
    n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
       {
         if(a[i]>a[j])
         {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
         }
       }
    }
   System.out.print("\n Third Largest Element ="+a[n-3]);
  }
}