import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Student> queue = new LinkedList<Student>();
        Random random = new Random();
        char id = 'a';

        while (queue.size() < 20) {
            queue.add(new Student(String.valueOf(id++), random.nextInt(800), random.nextInt(100)));
        } 

        System.out.println(queue);
        System.out.println(getAccepted(queue));
    }

    private static Queue<Student> getAccepted(Queue<Student> enrollees) {
        Queue<Student> acceptedQueue = new LinkedList<Student>();
        for (int i = 0; i < enrollees.size(); i++) {
            Student student = enrollees.poll();

            if (student.isAccepted()) acceptedQueue.add(student);
            enrollees.add(student);
        }


        return acceptedQueue;
    }
}
