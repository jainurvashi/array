public class BinaryArraySorting {
    public static void main(String[] agr){
        int[] ans= {1,0,1,1,0};
        binSort(ans,5);
    }

    static void binSort(int A[], int N)
    {
        int i=0;
        int j=N-1;
        while(i<j){
            while(i<N &&A[i]!=1 )
                i++;
            while(j>-1 &&A[j]!=0 )
                j--;
            if(i<j && A[i]==1 && A[j]==0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
    }
