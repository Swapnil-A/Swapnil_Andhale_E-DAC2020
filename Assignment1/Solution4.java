import java.util.Scanner;
public class Solution4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n upto where you on to print series of 12+22+32+42+52+....+n ");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=12;i<=n;i=i+10)
		{
			System.out.print(i);
			if(i<n)
			System.out.print("+");
			sum = sum + i;
		}
		System.out.print("\n Sum is : " + sum);

	}

}
