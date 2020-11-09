import java.util.Scanner;
class employee1
{
  private int empid;
  private String emp_name,emp_desig;
  public void getData()
  {
      Scanner din=new Scanner(System.in);
      System.out.print("\nEnter Employee Id =");
      empid=din.nextInt();
      din.nextLine();
      System.out.print("\nEnter Employee Name =");
      emp_name=din.nextLine();
      System.out.print("\nEnter Employee Designation =");
      emp_desig=din.nextLine();     
  }
  public void putData()
  {
      String e="Manager";
     Boolean d=emp_desig.equals(e);
     if(d==true)
     {
       System.out.println("\nemployee Id ="+empid);
       System.out.println("employee Name ="+emp_name);
       System.out.println("employee Designation ="+emp_desig);
     }   
  }
}
class example4_4_3
{
 
  public static void main(String args[])
  {
      Scanner din=new Scanner(System.in);
      int n=0;
      System.out.println("Enter no of Employee ");
      n=din.nextInt(); 
      employee1 st[]=new employee1[n];
      int i;
      for(i=0;i<n;i++)
      {
        st[i]=new employee1();
        st[i].getData();
      }
      for(i=0;i<n;i++)
        st[i].putData();
  }
}
