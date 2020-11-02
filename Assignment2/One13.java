package Assignment1;
import java.util.Scanner;
public class One13 {
	public static void main(String[] args) {

        int num1, num2, num3, result, temp;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        num2 = sc.nextInt();
        System.out.println("Enter Third Number:");
        num3 = sc.nextInt();
        sc.close();
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println("Largest Number is:"+result);

		

	}
}
