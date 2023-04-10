//Given a list of names, display the longest name.
public class Displaylongestname {
    String longest(String names[], int n) {
        String longest = names[0];
        for(int i=1;i<n;i++){
            if(names[i].length()>longest.length())
                longest = names[i];
        }
        return longest;
    }
}
