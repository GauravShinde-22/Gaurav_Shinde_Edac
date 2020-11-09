package Assinement6;
import java.util.Scanner;
class product
{
   static int pid;
   static int prize;
   static int quantity;
   product(){}
    product(int pid,int prize,int quantity)
    {
        this.pid=pid;
        this.prize=prize;
        this.quantity=quantity;
    }
    static void cal(int prize,int quantity)
    {
        int f=prize*quantity;
        System.out.println(f);
    }
     void show(int n,int r)
    {
        int d=0;
        for(int i=1;i<n;i++)
        {
            d=++r;
        }
     //  d=r++;
        System.out.println("Total pid = "+(d));
    }
}
class example6
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int i,a,b,c;
        int n=x.nextInt();
        product st[]=new product[n];
         a=x.nextInt();
        for(i=0;i<n;i++)
      {
           //a=x.nextInt();
           b=x.nextInt();
           c=x.nextInt();
        st[i]=new product(a,b,c);
        
          st[i].cal(b,c);
      }
        st[0].show(n,a);
      /*  for(i=0;i<n;i++)
        {
         st[i].cal(b,c);
        }*/
    }
}