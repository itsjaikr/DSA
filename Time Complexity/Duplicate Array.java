public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		int sum,res=0,sum1;
        int n=arr.length;
        int m=n-2;
        sum=0;
        sum=(m*(m+1))/2;
        sum1=0;
        for(int j=0;j<n;j++)
            sum1+=arr[j];
        res=sum1-sum;
        return res;
	}
}