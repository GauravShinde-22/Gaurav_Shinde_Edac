import java.util.Scanner;
class SimpleInterast
{
  double Si;
  void simple(double a,double b,double c)
  {
    Si=(a*b*c)/100;
    System.out.println("\n Simple Interast ="+Si);
  } 
}
class example5_4
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  double P,R,T,SI;
  System.out.print(" \n Enter the Principle Ammount ");
  P=x.nextDouble();
  System.out.print(" \n Enter the Rate of interast ");
  R=x.nextDouble();
  System.out.print(" \n Enter the Year ");
  T=x.nextDouble();
  SimpleInterast s=new SimpleInterast();
  s.simple(P,R,T);
  }
}