public class Solution1 {
   public static void main(String[] args) {
      int[]a = {23,60,94,3,102};
      int[]b = {42,16,74};
      int[]c = new int[a.length+b.length];
      int count = 0;
      
      for(int i = 0; i < a.length; i++)
      { 
         c[i] = a[i];
         count++;
      } 
      for(int j = 0; j < b.length;j++)
      { 
         c[count++] = b[j];
      } 
      for(int i = 0;i < c.length;i++) 
    	  System.out.print(c[i]+" ");
   } 
}