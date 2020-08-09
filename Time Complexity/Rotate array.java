import java.util.*;
public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
		int[] arr1;
        arr1= new int[d];
        int n=0;
        int len=arr.length;
        if(d>len)
            d=d-len;
        
        for(int i=0;i<d;i++)
            arr1[i]=arr[i];
        
        for(int j=0;j<len-d;j++)
         arr[j]=arr[j+d];
        
        
        for(int k=len-d;k<len;k++){
            arr[k]=arr1[n];
        	n++;
        }
        
	}
}