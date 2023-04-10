import java.util.HashMap;
import java.util.Map;

/*
Given an array of N positive integers where all numbers occur even number of times except one number which occurs
odd number of times. Find the exceptional number.
 */
public class Exceptionallyodd {
    int getOddOccurrence(int[] arr, int n) {
        HashMap<Integer,Integer> ans = new HashMap();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i], ans.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i : ans.entrySet()){
            if(i.getValue()%2!=0)
                return i.getKey();
        }
        return -1;
    }
}
