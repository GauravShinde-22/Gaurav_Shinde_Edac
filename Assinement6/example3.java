package Assinement6;
import java.util.Scanner;
class MathOpration
{
    static public void Add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition ="+c);
    }
    static public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println("Substraction ="+c);
    }
    static public void mul(int a,int b)
    {
        int c=a*b;
        System.out.println("Multiplication ="+c);
    }
    static public void power(int a,int b)
    {
        int c=a^b;
        System.out.println("Power ="+c);
    }
}
class example3
{
    public static void main(String args[])
    {
        MathOpration c=new MathOpration();
        Scanner x=new Scanner(System.in);
        int a,b;
        a=x.nextInt();
        b=x.nextInt();
        c.Add(a,b);
        c.sub(a,b);
        c.mul(a,b);
        c.power(a,b);
    }
}