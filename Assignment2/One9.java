package Assignment1;
import java.util.Scanner;
public class One9 {
	public static void main(String[] args) {
		int num, year, week, day;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days:");
		num = sc.nextInt();
		year = num / 365;

		System.out.println("No.of years:"+year);
		week = num / 7;

		System.out.println("No.of weeks:"+week);
		day = num;
		System.out.println("No.of days:"+day);
		sc.close();
	}

}



