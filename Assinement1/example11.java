import java.util.Scanner;
class example11
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  int a,b;
  System.out.println("Enter first number ");
  a=x.nextInt();
  System.out.println("Enter second number ");
  b=x.nextInt();
  System.out.println("before Swapping numbers are");
  System.out.println("a= "+a+" b= "+b); 
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("After Swapping Number are");
  System.out.println("a= "+a+" b= "+b);
 }
}