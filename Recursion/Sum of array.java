import java.util.*;
public class Solution {

	public static int sum(int input[]) {
		if(input.length==1)
        	return input[0];
        int sum1[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
            sum1[i-1]=input[i];
       return input[0]+sum(sum1);
        
        
    	 

        
		
	}
}