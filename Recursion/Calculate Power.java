public class Solution {

	public static int power(int x, int n) {
        int pow=0;
        if(n==0)
            return 1;
        else if(n==1)
            return x;
        else
            pow=power(x,n-1);
            return x*pow;
		
	}
}