import java.util.Scanner;
public class Solution10 {    
    public static void main(String[] args) {   
    	
        System.out.print("Enter no. of elements you want in array:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the number that you want:");
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Number in the array: ");    
        for (int i = 0; i <arr.length; i++)
        {     
            System.out.print(arr[i] + " ");    
        }    
          System.out.println();
        int even = 0, odd = 0; 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
  
        System.out.println("Even index positions sum: " + odd); 
        System.out.println("Odd index positions sum: " + even); 
         sc.close();
    }    
}    
