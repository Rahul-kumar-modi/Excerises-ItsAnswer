import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class RevK {
    public Queue<Integer> modifyQueue(Queue<Integer> q ,int k){
        Stack<Integer> st = new Stack<>();
        int n =q.size()-k;

        while(k-- >0){
            int a = q.peek();
            q.remove();
            st.push(a);
        }

        

        while(!st.isEmpty()){
            int a =st.peek();
            st.pop();
            q.add(a);
        }

        for(int i=0; i<n; i++){
            int a= q.peek();
            q.remove();
            q.add(a);
        }
        return q;
    }
    public static void main(String[] args) {
        RevK rev = new RevK();
        Queue <Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        Queue <Integer> newq = rev.modifyQueue(que , 4);
        System.out.println(newq);
    }
}
