public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        int i=0;
        int j= n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid]<k)
                i=mid+1;
            else
                j=mid-1;
        }
        return -1;
    }
}
