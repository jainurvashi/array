/*As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares.
Each of the squares has a tastiness level which is denoted by an array A[]. Ishaan can eat the first or the last square
of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now,
Ishaan being greedy eats the more tasty square first. Determine the tastiness level of the square which his sister gets.*/
public class IshaanLovesChocolates {
    public static int chocolates(int n, int[] arr) {
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]<=arr[j])
                j--;
            else if(arr[i]>arr[j])
                i++;
        }
        return arr[i];
    }
}
