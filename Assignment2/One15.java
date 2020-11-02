package Assignment1;
import java.util.Scanner;
public class One15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age");
		System.out.println("Enter sex: Male or Female");
		int age = sc.nextInt();
		sc.nextLine();
		String gender= sc.nextLine();



		System.out.println("Your Gender = "+gender);
		if(age >=18) {
			System.out.println("You are eligible for marriage");
		}
		else {
			System.out.println("You are not eligible for marriage");
		}

		sc.close();

	}
}
