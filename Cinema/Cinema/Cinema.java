package Cinema.Cinema;

import java.util.Queue;
import java.util.LinkedList;

public class Cinema {
    private int currentVisitors;
    private Queue<String>[] standPointArray;
    private static int theatres = 10;

    public Cinema() {  
        this.currentVisitors = 0;
        this.standPointArray = new Queue[10];

        for (int i = 0; i < theatres; i++) {
            this.standPointArray[i] = new LinkedList<String>();
        }
    }
    public boolean isEmpty() {
        if (this.currentVisitors == 0) return true;
        return false;
    }
    public boolean isListed(String id, Queue<String> standPoint) {
        int queueSize = standPoint.size();
        boolean flag = false;
        for (int i = 0; i < queueSize; i++) {
            String element = standPoint.poll();
            if (element.equals(id)) flag = true;
            standPoint.add(element);
        }

        return flag;
    }
    public void insert(String id, int standPoint) {
        Queue<String> standPointQueue = this.standPointArray[standPoint - 1];
        if (isListed(id, standPointQueue)) return;
        
        this.currentVisitors++;
        standPointQueue.add(id);
    } 
    public String poll(int standPoint) {
        this.currentVisitors--;
        return this.standPointArray[standPoint - 1].poll(); 
    }
    public String peek(int standPoint) {
        return this.standPointArray[standPoint - 1].peek(); 
    }
    public String toString() {
        return String.format("The cinema is empty: %b", isEmpty());
    }
    public Queue[] getStandPointArray() {
        return this.standPointArray;
    }
}
