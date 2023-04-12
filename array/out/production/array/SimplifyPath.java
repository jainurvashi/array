package easy;

import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] agr){
        simplifyPath("/home//foo/");
    }
    static    public String simplifyPath(String path) {
        Stack<String> STACK = new Stack<>();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                s.append(path.charAt(i));
                i++;
                while(i<path.length()&&path.charAt(i)!='/'){
                    s.append(path.charAt(i));
                    i++;
                }
                if(s.toString().equals("/..")&& !STACK.isEmpty())
                    STACK.pop();
                else if(s.toString().equals("/.")||s.toString().equals("/..")){

                }
                else{

                    STACK.push(s.toString());

                }
                s = new StringBuilder();
                i--;
            }
        }
        String ans ="";
        while(!STACK.isEmpty()){
            ans = STACK.pop()+ans;
        }
        return ans;
    }
}
