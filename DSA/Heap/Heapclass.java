import java.util.Comparator;
import java.util.PriorityQueue;

public class Heapclass {

    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
    
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
    
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(11);
        pq.add(36);
        pq.add(04);
        pq.add(96);
        pq.add(98);

        PriorityQueue<Student> pqc = new PriorityQueue<>(Comparator.reverseOrder());

        pqc.add(new Student("kiran",11));
        pqc.add(new Student("patil",15));
        pqc.add(new Student("dip",25));
        pqc.add(new Student("pat",110));

        System.out.println("PriorityQueue with reveser Order");
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    
        System.out.println("PriorityQueue with class and object");
        while(!pqc.isEmpty()){
            System.out.println(pqc.peek().name+" - > "+ pqc.peek().rank);
            pqc.remove();

        }
    }
}
