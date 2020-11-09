package Assinement6;
import java.util.Scanner;
class Math
{
    void mult(int a,int b)
    {
        int z=a*b;
        System.out.println("Multiplication of two integer = "+z);
    }
    void mult(float a,float b,float c)
    {
        float d=a*b*c;
        System.out.println("Multiplication of float number  "+d);
    }
    void mult(int x[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum*x[i];
        }
        System.out.println("Array Multiplication = "+sum);
    }
    void mult(float e,double g)
    {
        double h=(double)(e*g);
        System.out.println("One float One Double multiplication ="+h);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,a,b;
        System.out.println("Size of array=");
        n=s.nextInt();
        int x[]=new int[n];
        System.out.println("Enter array element = ");
        for(int i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("enter two integer number = ");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("enter three float number = ");
        float q=s.nextFloat();
        float w=s.nextFloat();
        float r=s.nextFloat();
        System.out.println("enter One float & One Double number = ");
        float u=s.nextFloat();
        double p=s.nextDouble();
        Math ma=new Math();
        ma.mult(a,b);
        ma.mult(q,w,r);
        ma.mult(x,n);
        ma.mult(u,p);
    }
}
