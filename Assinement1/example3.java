import java.util.Scanner;
class example3
{
 public static void main(String args[])
 {
  int x,y,z;
  Scanner m=new Scanner(System.in);
  x=m.nextInt();
  y=((x*x)+(3*x)-7);
  System.out.println(" y = "+y);
  y=x++ + ++x;
  System.out.println(" x = "+x+" y = "+y);
  z=x++ - --y - --x + ++x;
  System.out.println(" x = "+x+" y = "+y+" z = "+z);
  boolean a=false,b=false,c;
  c=a && b ||!(a||b);
  System.out.println(" x = "+a+" y = "+b+" z = "+c);
 }
}