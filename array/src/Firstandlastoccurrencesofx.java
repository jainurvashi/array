import java.util.ArrayList;

public class Firstandlastoccurrencesofx {
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> arrayList = new ArrayList();
        int i=0;
        long start = -1;
        long last =-1;
        int j = n-1;
        while(i<=j){
            if(arr[i]==x && start==-1)
                start = i;
            if(arr[j]==x && last ==-1)
                last =j;
            if(start!=-1 && last!=-1)
                break;
            i++;
            j--;
        }
        arrayList.add(start);
        arrayList.add(last);
        return arrayList;
    }
}
