import java.util.Scanner;
class example6
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  float a,r;
  System.out.println("Enter the Radius");
  r=x.nextFloat();
  a=(float)3.14*2*r;
  System.out.println("Circumfarance of circlr = "+a);
 }
}