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

        System.out.printf("The amount of elements is: %d\n", getQueueSizeRecursively(queue));
    }
    private static int getQueueSizeRecursively(Queue<Integer> queue) {
        if (queue.peek() == null) return 0;
        int size = 1;
        int element = queue.poll();

        size += getQueueSizeRecursively(queue);
        queue.add(element);
        return size;
    }
}
