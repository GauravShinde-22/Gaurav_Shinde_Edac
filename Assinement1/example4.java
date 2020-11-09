import java.util.Scanner;
class example4
{
 public static void main(String args[])
  {
   byte a,b,c;
   Scanner x=new Scanner(System.in);
   System.out.println("enter two byte number ");
   a=x.nextByte();
   b=x.nextByte();
   c=(byte)(a+b);
   System.out.println("Addition of two number are"+c);
  }
}