package PackingCookies;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Cookie> q1 = new LinkedList<Cookie>();
        Queue<Cookie> q2 = new LinkedList<Cookie>();
        char name = 'a';
        
        while (q1.size() < 10) {
            q1.add(new Cookie(String.valueOf(name++), true));
            q2.add(new Cookie(String.valueOf(name++), false));
        }

        System.out.println(packingCookies(q1, q2));
    }
    private static Queue<Cookie> packingCookies(Queue<Cookie> q1, Queue<Cookie> q2) {
        Queue<Cookie> queue = new LinkedList<Cookie>();
        
        while (!(q1.isEmpty() && q2.isEmpty())) {
            Cookie element1 = null;
            Cookie element2 = null;

            if (q1.peek() != null) element1 = q1.poll();
            if (q2.peek() != null) element2 = q2.poll();

            if (element1 != null) {
                queue.add(element1);
                q1.add(element1);
            }
            if (element2 != null) {
                queue.add(element2);
                q2.add(element2);
            }
        }
        
        return queue;
    }
}