import java.util.Scanner;
class example3_2
{
 public static void main(String args[])
 {
  int n;
  Scanner x=new Scanner(System.in);
  System.out.println("Enter the number = ");
  n=x.nextInt();
  int k=2;
  while(k<n)
  {
   if((n%k)==0)
   {
    System.out.println(n+" Number is not prime");
    break;
   }
   k++;
  }
 if(n==k)
  {
   System.out.println(n+" Number is Prime");
  }
 }
}