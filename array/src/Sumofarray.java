//Given an integer array arr of size n, you need to sum the elements of arr.
public class Sumofarray {
    public long getSum(long a[], long n)
    {
        long ans = 0L;
        for(int i=0;i<n;i++){
            ans+=a[i];
        }
        return ans;
    }
}
