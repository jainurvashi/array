/*
Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.
 */
public class LastindexofOne {
    public int lastIndex( String s) {
        int j = s.length()-1;
        while(j>=0){
            if(s.charAt(j)=='1')
                return j;
            j--;
        }
        return -1;
    }
}
