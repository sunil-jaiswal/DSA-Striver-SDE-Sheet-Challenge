import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int k){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.size()-1; i >= 0; i--){
            int n = arr.get(i);
            while(!st.isEmpty() && st.peek() >= n){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }
            st.push(n);
        }
        Collections.reverse(ans);
        return ans;
    }
}