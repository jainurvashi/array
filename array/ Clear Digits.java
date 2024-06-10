import java.util.Arrays;
import java.util.Stack;

public class  Clear Digits {
        public String clearDigits(String s) {
                StringBuilder ans = new StringBuilder();
                Stack<Character>stack = new Stack<>();
                for(int i=0;i<s.length();i++){
                        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                                stack.pop();
                        }else{
                                stack.push(s.charAt(i));
                        }
                }
                while (!stack.isEmpty()){
                        ans.insert(0, stack.pop());
                }
                return ans.toString();
        }
}
