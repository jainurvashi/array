import java.util.ArrayList;
//Given an array Arr of N positive integers. Your task is to find the elements
// whose value is equal to that of its index value ( Consider 1-based indexing ).
public class Valueequaltoindexvalue {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i=0;i<n;i++){
            if((i+1)==arr[i])
                arrayList.add(arr[i]);
        }
        return arrayList;
    }
}
