public class Cyclicallyrotateanarraybyone {
    public void rotate(int arr[], int n)
    {
        reverseAArray(arr,0,n-1);
        reverseAArray(arr,1,n-1);
    }
    void reverseAArray(int nums[], int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
