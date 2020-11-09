import java.util.Scanner;
public class Solution6 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elemnt you want to insert");
	    int temp, size;
	    int n=sc.nextInt();
	    int array[] =new int[n];
	    System.out.println("Enter the value of elemnt that you want to insert");
	    for(int i=0;i<array.length;i++) 
	    {
	      array[i]=sc.nextInt();	
	    }
         size = array.length;
      for(int i = 0; i<size; i++ )
      {
      for(int j = i+1; j<size; j++)
      {
         if(array[i]>array[j])
         {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+array[size-3]);
   sc.close();
   }
}