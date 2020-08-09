public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		int n=0;
        if (input.length==0)
            return false;
        if(input[n]==x)
            return true;
        int newArray[]= new int[input.length-1];
        for(int i=1;i<input.length;i++)
             newArray[i-1]=input[i];
        return checkNumber(newArray,x);
            
       
    
		}
}