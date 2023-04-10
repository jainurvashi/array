public class Countofsmallerelements {
    public long countOfElements(long arr[], long n, long x)
    {
        long ans =0L;
        for(int i=0;i<n;i++){
            if(arr[i]<=x)
                ans++;
        }
        return ans;
    }
}
