import java.util.Arrays;

public class Printtheleftelement
{
public static void main(String[] agr){
    long[] ans= {9, 11, 1, 4, 8, 6, 1};
    leftElement(ans,7);
}

    static public long leftElement(long arr[], long n)
    {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int level =1;
        while(i<=j){
            if(i==j)
                return arr[i];
            if(level%2==0)
                i++;
            else
                j--;
            level++;
        }
        return arr[i];
    }
}
