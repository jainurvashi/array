import java.util.*;

class Solution {
    static  public int findWinningPlayer(int[] skills, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxI = 0;
        int max = skills[0];
        int i=1;
        if(k>skills.length){
            for(int j=1;j<skills.length;j++){
                if(max<skills[j]){
                    max =skills[j];
                    maxI = j;
                }
            }
            return maxI;
        }
        while(true){
            if(max<skills[i]){
                max =skills[i];
                maxI = i;
                hashMap.put(i,hashMap.getOrDefault(i,0)+1);
                if(hashMap.get(i)>=k)
                    return i;
            }else{
                hashMap.put(maxI,hashMap.getOrDefault(maxI,0)+1);
                if(hashMap.get(maxI)>=k)
                    return maxI;
            }
            i++;
            if(i>=skills.length){
                i=0;
            }
        }
    }
}