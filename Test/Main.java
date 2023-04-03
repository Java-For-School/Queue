import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}