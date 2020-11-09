import java.util.Scanner;
class example7
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  int a,b,c,d,e;
  float par,sum;
  System.out.println("Enter the marks of student");
  System.out.print("Enter marks of 1st subject ");
  a=x.nextInt();
  System.out.print("\n Enter marks of 2nd subject ");
  b=x.nextInt();
  System.out.print("\n Enter marks of 3rd subject ");
  c=x.nextInt();
  System.out.print("\n Enter marks of 4th subject ");
  d=x.nextInt();
  System.out.print("\n Enter marks of 5th subject ");
  e=x.nextInt();
  sum=a+b+c+d+e;
  par=(sum/500)*100;
  System.out.println("Percentage are ="+par+"%");
 }
}