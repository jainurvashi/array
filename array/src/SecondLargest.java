//Given an array Arr of size N, print second largest distinct element from an array.
public class SecondLargest
{
    int print2largest(int arr[], int n) {
        if(n==0) return 0;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
