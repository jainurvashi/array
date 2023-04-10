/*Given an array of size N. The task is to rotate array by D elements where D ≤ N.*/
public class RotatinganArray {
    void leftRotate(int[] arr, int n, int d) {
        rotateArray(arr,0,n-1);
        rotateArray(arr,0,n-d-1);
        rotateArray(arr,n-d,n-1);

    }
    void rotateArray(int[] arr,int start,int last){
        while(start<last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
}
