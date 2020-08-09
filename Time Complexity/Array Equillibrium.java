public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
       int i=0, j=0; 
       int leftsum, rightsum; 
       int  len=arr.length;
  
       int totalsum=0;
        while(i<len){
            totalsum+=arr[i];
            i++;
        }
        rightsum=0;
        leftsum=0;
        while(j<len){
            rightsum=totalsum-leftsum-arr[j];
            
  		if (leftsum == rightsum) 
                return j; 
        else
                leftsum=leftsum+arr[j];
        j++;
            }
         
        return -1;
        
           
        
        	
        
        
	}
  	 
}