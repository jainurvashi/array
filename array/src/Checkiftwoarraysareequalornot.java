import java.util.Arrays;

public class Checkiftwoarraysareequalornot {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            if(A[i]!=B[i])return false;
        }
        return true;
    }
}
