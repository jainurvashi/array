import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {
    public int maximumNumberOfStringPairs(String[] words) {
        List<Integer> Index = new ArrayList();
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!Index.contains(j)) {
                    if (words[i].charAt(0) == words[j].charAt(1) &&
                            words[i].charAt(1) == words[j].charAt(0)) {
                        Index.add(j);
                        ans++;
                    }
                }

            }
        }
        return ans;
    }
}


