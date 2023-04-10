import java.util.ArrayList;
import java.util.List;

public class Findminimumandmaximumelementinanarray {
    static List<Long> getMinMax(long a[], long n)
    {
List<Long> arrayList = new ArrayList();
        long min =Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min =Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        arrayList.add(min);
        arrayList.add(max);
        return arrayList;
    }
}
