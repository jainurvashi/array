//Given a sorted array Arr of size N and a value X, find the number of array elements less than or
// equal to X and elements more than or equal to X.
public class SmallerandLarger {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int[] ans = new int[2];
        int min =0;
        int max =0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x)
                min++;
            if(arr[i]>=x)
                max++;
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}
