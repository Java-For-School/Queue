import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int number = 1;
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.printf("The number %d is in the Queue: %b\n", number, isExists(queue, number)); 
        
        number = 9;
        System.out.printf("The number %d is in the Queue: %b\n", number, isExists(queue, number)); 

        System.out.println(queue);
    }

    private static boolean isExists(Queue<Integer> queue, int number) {
        for (int i = 0; i < queue.size() * 2 - 1; i++) {
            int element = queue.poll();
            queue.add(element);
            
            if (element == number) return true;
        }

        return false;
    }
}
