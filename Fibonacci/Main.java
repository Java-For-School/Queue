import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue2.add(8);

        queue.add(4181);
        queue.add(2584);
        queue.add(1597);
        queue.add(987);
        queue.add(610);
        queue.add(377);
        queue.add(233);
        queue.add(144);
        queue.add(89);
        queue.add(55);
        queue.add(34);
        queue.add(21);
        queue.add(13);
        queue.add(8);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(1);
        queue.add(0);

        System.out.println("Does the queue implement Fibonacci's series? " + isFibonacciHelper(queue));
        queue.add(69);
        System.out.println("Does the queue implement Fibonacci's series? " + isFibonacciHelper(queue));
    }
    private static Queue<Integer> duplicateQueue(Queue<Integer> queue) {
        Queue<Integer> newQueue = new LinkedList<Integer>();
        for (int i = 0; i < queue.size(); i++) {
            int element = queue.poll();
            newQueue.add(element);
            queue.add(element);
        }

        return newQueue;
    }
    private static boolean isFibonacci(Queue<Integer> queue, int current) {
        System.out.println(queue);
        if (queue.size() == 1) {
            System.out.println(queue);
            if (current == 1 && queue.peek() == 0) return true;
            return false;
        }

        int peek = queue.poll();
        int subPeek = queue.peek();

        if (peek + subPeek != current) return false;
        
        return isFibonacci(queue, peek);
    }
    private static boolean isFibonacciHelper(Queue<Integer> queue) {
        if (queue.size() < 3) return false;
        System.out.printf("The size of the Queue is: %d\n", queue.size());
        System.out.println(queue);
        Queue<Integer> newQueue = duplicateQueue(queue);
        return isFibonacci(newQueue, newQueue.poll());
    } 
}
