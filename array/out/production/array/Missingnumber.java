package easy;

import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] agr){
        int[] ans= {1,3,4};
        missingNumber(ans,4);
    }
    public static int missingNumber(int A[], int N)
    {
        int sum =0;
        for(int i=0;i<A.length;i++){
            sum+= A[i];
        }
        return (N*(N+1)/2)-sum;
    }
}
