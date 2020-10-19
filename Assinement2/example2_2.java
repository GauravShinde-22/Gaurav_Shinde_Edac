import java.util.Scanner;
class example2_2
{
 public static void main(String args[])
  {
   Scanner x=new Scanner(System.in);
   int n,rev=0,a;
   System.out.print("\n Enter the Number = ");
   n=x.nextInt();
   while(n!=0)
   {
    a=n%10;
    rev=(rev*10)+a;
    n=n/10;
   }
   System.out.println(" Reverse number = "+rev);
  }
}