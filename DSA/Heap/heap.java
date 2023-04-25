import java.util.Comparator;
import java.util.PriorityQueue;
public class heap {
 
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5);
        pq.add(95);
        pq.add(58);
        pq.add(85);
        pq.add(77);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
