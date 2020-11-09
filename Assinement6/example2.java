package Assinement6;
import java.util.Scanner;
class circle
{
    double rad,area1;
    public void init()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Radius");
        rad=x.nextDouble();
    }
    public void area()
    {
        area1=3.14*rad*rad;
    }
    public void show()
    {
        System.out.println("Area of circle = "+area1);
    }    
}
class example2
{
    public static void main(String args[])
    {
        circle c=new circle();
        c.init();
        c.area();
        c.show();
    }
}