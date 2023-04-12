package easy;

public class Multiplyleftandrightarraysum {

    public static void main(String[] agr){
        int[] ans= {4,5,6,7};
        multiply(ans,4);
    }
    public static int multiply (int arr[], int n) {
        int i=0;
        int j= n-1;
        int sumLeft =0;
        int sumRight =0;
        while(i<j){

            sumRight+=arr[j];
            sumLeft +=arr[i];
            i++;
            j--;
        }
        if(i==j)
            sumRight+=arr[j];
        return sumLeft*sumRight;
    }
}
