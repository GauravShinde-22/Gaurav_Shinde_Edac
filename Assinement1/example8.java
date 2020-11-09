import java.util.Scanner;
class example8
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
  SI=(P*R*T)/100;
  System.out.println(" \n Simple Interast is = "+SI);
 }
}