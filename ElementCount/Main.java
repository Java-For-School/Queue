import java.util.Queue;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.printf("The amount of elements in the queue is: %d\n", ElementCountWithoutNewQueue(queue));
    }
    private static int ElementCount(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<Integer>();
        int count = 0;
        
        while (!queue.isEmpty()) {
            ++count;
            temp.add(queue.poll());
        }

        while (!temp.isEmpty()) queue.add(temp.poll());

        return count;
    }
    private static int ElementCountWithoutNewQueue(Queue<Integer> queue) {
        int count = 0;

        queue.add(Integer.MAX_VALUE);

        while (queue.peek() != Integer.MAX_VALUE) {
            queue.add(queue.poll());
            ++count;
        }
        return count;
    }
}
