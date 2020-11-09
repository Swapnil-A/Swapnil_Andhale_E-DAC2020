
class Solution2 { 
	static void avg(int arr[], int n) 
	{ 
		int avg = 0; 
		for (int i = 0; i<n; i++) 
		{
			avg = ((arr[i] + arr[i + 1] +arr[i+2])/(3)); 
			System.out.print(avg + " "); 
			
		} 
	} 
	public static void main(String[] args) 
	{ 
	
		int arr[] = {5,14,35,89,140}; 
		int n = arr.length; 
		avg(arr, n); 
	} 
} 
