public class FindUnique{
     public static int findUnique(int[] arr){
        int size=arr.length;
         int res = arr[0]; 
        for (int i = 1; i < size; i++) 
            res = res ^ arr[i]; 
      
        return res; 
     }
}