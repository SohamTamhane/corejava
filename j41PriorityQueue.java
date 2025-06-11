import java.util.*;

public class j41PriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(10);
        q.add(20);

        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
