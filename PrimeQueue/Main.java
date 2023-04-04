import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(2);
        queue.add(3);
        queue.add(29);
        queue.add(6);
        queue.add(8);

        System.out.printf("The numbers of prime numbers in the queue is: %d\n", primeCount(queue));
        System.out.println(queue);
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
    private static int primeCount(Queue<Integer> queue) {
        int count = 0;
        for (int i = 0; i < queue.size(); i++) {
            int element = queue.poll();
            if (isPrime(element)) ++count;
            queue.add(element);
        }

        return count;
    }
}
