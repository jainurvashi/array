public class Swapkthelements {
    void swapKth(int arr[], int n, int k) {
        int i=0;
        int j=n-1;
        while(i<n){
            if(i==k-1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
    }
}
