import java.util.*;

public class j40Stack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);

        System.out.println(st);
        System.out.println("Search 10: " + st.search(10));
        System.out.println("Element at 0: " + st.get(0));

        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
