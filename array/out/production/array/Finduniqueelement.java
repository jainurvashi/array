package easy;

import java.util.HashMap;
import java.util.Map;

/*Given an array of size n which contains all elements occurring in multiples of K, except one element which doesn't occur
in multiple of K. Find that unique element.*/
public class Finduniqueelement {

    public int findUnique(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> ans = new HashMap();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i], ans.getOrDefault(arr[i],0)+1);
        }
        int ansVal =Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> i : ans.entrySet()){
            if(i.getValue()%k!=0){
                ansVal = i.getKey();
            }

        }
        return ansVal ==Integer.MAX_VALUE?-1:ansVal ;
    }
}
