import java.util.Scanner;
class example4_2
{
 public static void main(String args[])
 {
  int n,i;
  Scanner x=new Scanner(System.in);
  System.out.print("\n Enter the number upto you want to print = ");
  n=x.nextInt();
  int sum=((n*(n+1)*(2*n+1))/6);
  for(i=1;i<=n;i++)
  {
    System.out.print(i+"^2 + ");
  }
  System.out.print(" = "+sum);
 }
}