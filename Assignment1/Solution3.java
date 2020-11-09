import java.util.Scanner;
public class Solution3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check wheather is a prime or not ");
		int num=sc.nextInt();
		sc.close();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
        	System.out.println(num + " is a  non-prime number.");

	}

}
