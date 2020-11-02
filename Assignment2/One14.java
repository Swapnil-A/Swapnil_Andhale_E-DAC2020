package Assignment1;
import java.util.Scanner;
public class One14 {
	public static void main(String[] args) {
		int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
    	scan.close();
        boolean Leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    Leap = true;
                else
                    Leap = false;
            }
            else
                Leap = true;
        }
        else {
            Leap = false;
        }

        if(Leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");

	}
}
