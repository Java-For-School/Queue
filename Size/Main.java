import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(123);
        queue.add(12312);
        queue.add(100);
        queue.add(1);
        queue.add(10);

        System.out.println(SizeWithoutDuplication(queue));
    }
    // First Implementation
    private static int Size(Queue<Integer> qu) {
        Queue<Integer> temp = new LinkedList<Integer>();
        int count = 0;

        while (!qu.isEmpty()) {
            int element = qu.poll();
            if (element > 99 && element < 1000) ++count;
            temp.add(element);
        }
        while (!temp.isEmpty()) qu.add(temp.poll());

        return count;
    }
    private static int SizeWithoutDuplication(Queue<Integer> queue) {
        int count = 0;

        Object[] array = queue.toArray(); 

        for (Object number:array) {
            int intNumber = Integer.valueOf(number.toString());
            if (intNumber > 99 && intNumber < 1000) ++count;
        }

        return count;
    }
}
