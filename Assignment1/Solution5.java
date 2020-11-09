import java.util.Scanner;
class Solution5
{
   public static void main (String[] args)
   {		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of teo number in beteen you want prime number:");
      int i =sc.nextInt();
      int n=sc.nextInt();
      int num =0;
      String  primeNumbers = "";
      sc.close();
      for (; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
        {
	       if(i%num==0)
	     {
		   counter = counter + 1;
	     }
	    }
	 if (counter ==2)
	 {
	   
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers between your range is:");
      System.out.println(primeNumbers);
   }
}
