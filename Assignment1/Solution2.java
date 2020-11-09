import java.util.Scanner;
public class Solution2 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number that you want to reverse");
        int num =sc.nextInt(); 
        int reversed = 0;
        sc.close();
        for(;num != 0; num /= 10)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number =" + reversed);
        
	}

}
