import java.util.Scanner;
class Bank
{
  int id;
  String name;
  float balance,wbalance,rbalance,mbalance,cbalance;
  Scanner x=new Scanner(System.in);
  public void get()
  {
    System.out.println("Enter Bank Account Id");
    id=x.nextInt();
    x.nextLine();
    System.out.println("Enter Name");
    name=x.nextLine();
    System.out.println("Enter Balance Ammount");
    balance=x.nextFloat();
  }
  public void deposit()
  {
   System.out.println("Enter Ammount You want To Deposit");
   rbalance=x.nextFloat();
   mbalance=balance+rbalance;
   if(mbalance>1000)
   {
     System.out.println("\nAccount Id :- "+id);
     System.out.println("Account Holder Name :- "+name);
     System.out.println("Balance before Deposite :- "+balance);
     System.out.println("Balance after Deposite :- "+mbalance);
   }
   else
   {
    System.out.println("Ammount in Account Is Less Than 1000");
   } 
  }
  public void withdraw()
  {
   System.out.println("Enter Ammount You want To Withdraw");
   wbalance=x.nextFloat();
   cbalance=balance-wbalance;
   if(cbalance>1000)
   {
     System.out.println("\nAccount Id :- "+id);
     System.out.println("Account Holder Name :- "+name);
     System.out.println("Balance before Withdraw :- "+balance);
     System.out.println("Balance after Withdraw :- "+cbalance);
   }
   else
   {
    System.out.println("Ammount in Account Is Less Than 1000 So you cannot withdraw");
   } 
  }
  public void print()
  {
    System.out.println("\nAccount Id :- "+id);
    System.out.println("Account Holder Name :- "+name);
    System.out.println("Balance before Deposite :- "+balance);
  }
}
class example3_4
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   int n;
   Bank b=new Bank();
   System.out.print("\n 1.Withdraw from your Account \n 2.Deposit To your bank Account \n 3.Check Account Balance ");
   System.out.print("\n Enter your choice = ");
   n=s.nextInt();
   switch(n)
   {
    case 1:
           b.get();
           b.withdraw();
           break;
    case 2:
           b.get();
           b.deposit();
           break;
    case 3:
           b.get();
           b.print();
           break;
    default:System.out.println("Wrong Opration You Perform");
   }
  }
}