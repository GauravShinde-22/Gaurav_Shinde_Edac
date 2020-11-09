import java.util.*;
class example8_5
{
	public static void main(String args[])
	{
		System.out.print("Enter String to be reversed : ");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
                str=str.toLowerCase();
		StringBuffer sb = new StringBuffer(str);
		StringBuffer str1 = new StringBuffer(sb.reverse());
		System.out.println(str1);
		
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println(sbuilder.reverse());
		
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		for (int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}