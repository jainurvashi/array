//Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
public class SumofSeries {
    long seriesSum(int n) {
        long data =(long) n;
        if(n==0)return 0L;
        return data*(data+1)/2;

    }
}
