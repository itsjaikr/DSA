import java.util.*;
public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
        Arrays.sort(arr);
        int n=arr.length;
        for (int i = 0; i < n - 2; i++) { 
        for (int j = i + 1; j < n - 1; j++) { 
            for (int k = j + 1; k < n; k++) { 
                if (arr[i] + arr[j] + arr[k] == x) { 
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                } 
            } 
        } 
    } 
} 
        
		
	
}