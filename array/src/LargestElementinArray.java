public class LargestElementinArray {
    public int largest(int arr[], int n)
    {
        if(n==0)return 0;
        int max = arr[0];
        for(int i=0;i<n;i++)
            max = Math.max(max,arr[i]);
        return max;
    }
}
