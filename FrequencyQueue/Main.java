import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(-9);
        queue.add(-9);
        queue.add(1);
        queue.add(-9);
        queue.add(5);
        queue.add(1);
        queue.add(4);
        queue.add(4);
        queue.add(1);

        System.out.println(frenquencyQueue(queue));
    }
    private static int removeNumberFromQueue(Queue<Integer> queue, int number) {
        int count = 0;
        int queueSize = queue.size(); 
        for (int i = 0; i < queueSize; i++) {
            int element = queue.poll();

            if (element != number) queue.add(element);
            else count++;
        }

        return count;
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

    private static Queue<Integer> frenquencyQueue(Queue<Integer> queue) {
        Queue<Integer> clonedQueue = cloneQueue(queue);
        Queue<Integer> newQueue = new LinkedList<Integer>();

        while (!clonedQueue.isEmpty()) {
            int element = clonedQueue.peek();
            newQueue.add(removeNumberFromQueue(clonedQueue, element));
            newQueue.add(element);
        }
        
        return newQueue;
    }
}
