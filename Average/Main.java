import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(5);
        queue.add(10);

        System.out.println(Average(queue));
        System.out.println(queue);
    }
    private static double Average(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<Integer>();
        int sum = 0;
        
        while (!queue.isEmpty()) {
            int element = queue.poll();
            sum += element;
            temp.add(element);
        }

        while (!temp.isEmpty()) queue.add(temp.poll());

        return (double) sum / queue.size(); 
    }
}
