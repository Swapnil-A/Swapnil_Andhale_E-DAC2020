import java.util.Scanner;
public class Solution1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that you want to print their table");
		int num=sc.nextInt();
		System.out.println("Table of "+num+" is as follows:");
		
		for(int i=1;i<=10;i++)
		{
			int table=(i*num);
			System.out.println(table);
		}
		 System.out.println();
		 sc.close();
		 
	}

}
