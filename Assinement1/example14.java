import java.util.Scanner;
class example14
{
 public static void main(String args[])
 {
  int a;
  Scanner x=new Scanner(System.in);
  System.out.println("Enter the year you want to check");
  a=x.nextInt();
  int z=a%4;
  if(z==0)
  {
   System.out.println(a+" Is Year is leap");
  } 
  else
  {
   System.out.println(a+" Is not leap year");
  }
 }
}