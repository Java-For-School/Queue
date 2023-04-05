import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();

        queue.add(1);
        queue.add(3);
        queue.add(5);

        queue2.add(2);
        queue2.add(4);
        queue2.add(6);

        System.out.println(mergeQueue(queue, queue2));
    }
    private static Queue<Integer> mergeQueue(Queue<Integer> queue1, Queue<Integer> queue2) {
        Queue<Integer> newQueue = new LinkedList<Integer>();
        while (!(queue1.isEmpty() || queue2.isEmpty())) {
            int element1 = Integer.MAX_VALUE;
            int element2 = Integer.MAX_VALUE;

            if (queue1.peek() != null) element1 = queue1.poll();
            if (queue2.peek() != null) element2 = queue2.poll();

            if (element1 != Integer.MAX_VALUE) {
                newQueue.add(element1);
                queue1.add(element1);
            }
            if (element2 != Integer.MAX_VALUE) {
                newQueue.add(element2);
                queue2.add(element2);
            }
        }

        return newQueue;
    }
}
