
public class Solution {

	public static int lastIndex(int input[], int x) {
		if (input.length==0)
            return -1;
     
       
        int newArray[]= new int[input.length-1];
        for(int i=1;i<input.length;i++)
             newArray[i-1]=input[i];
       
        int n=lastIndex(newArray,x);
       
        if(n!=-1)
            return n+1;
        else if(input[0]==x)
            return 0;
        else 
            return -1;
        
	}
	
}