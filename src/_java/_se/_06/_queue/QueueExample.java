package _java._se._06._queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Oklahoma");
        queue.offer("Indiane");
        queue.offer("Georgia");
        queue.offer("Texas");
        while (queue.size() > 0)
            System.out.println(queue.remove() + " ");
    }
}
