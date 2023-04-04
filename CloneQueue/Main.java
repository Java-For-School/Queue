import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        System.out.println(cloneQueue(queue));
        System.out.println(queue);
    }
    private static Queue<Integer> cloneQueue(Queue<Integer> queue) {
        Queue<Integer> newQueue = new LinkedList<Integer>();

        for (int i = 0; i < queue.size(); i++) {
            int element = queue.poll();

            newQueue.add(element);
            queue.add(element);
        }

        return newQueue;
    } 
}
