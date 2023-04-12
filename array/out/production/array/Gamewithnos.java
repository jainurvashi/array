package easy;
/*
You are given an array arr[], and you have to re-construct an array arr[].
The values in arr[] are obtained by doing Xor of consecutive elements in the array.*/
public class Gamewithnos {
    public static int[] game_with_number (int arr[], int n) {
        int[] ans = new int[arr.length];
        for(int i=0;i<n;i++){
            if(i==n-1)
                ans[i] = arr[i];
            else
                ans[i] = arr[i]^arr[i+1];
        }
        return ans;
    }
}
