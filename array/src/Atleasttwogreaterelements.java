import java.util.Arrays;

public class Atleasttwogreaterelements {
    public long[] findElements( long a[], long n)
    {
        if(n<3) return new long[0];
        Arrays.sort(a);
        long[] ans = new long[a.length-2];
        for(int i=0;i<ans.length;i++){
            ans[i] = a[i];
        }
        return ans;
    }
}
