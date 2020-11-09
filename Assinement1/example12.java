import java.util.Scanner;
class example12
{       
       public static void main(String args[])
       {
         Scanner x=new Scanner(System.in); 
         float bs, gs, da, hra;
	 System.out.println("Enter basic salary");
	 bs=x.nextFloat();
	 if(bs<10000)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
	 else
		{
			hra = 2000;
			da = bs * 98 / 100;
		}
	 gs = bs + hra + da;
	 System.out.println("You Entered Basic Salary = "+bs);
	 System.out.println("HRA = "+hra);
	 System.out.println("DA = "+da);
	 System.out.println("Gross salary ="+gs);
}
}