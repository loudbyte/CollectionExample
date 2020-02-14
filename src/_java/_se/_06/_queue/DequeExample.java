package _java._se._06._queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.offer("Oklahoma");
        deque.offer("Indiane");
        deque.addFirst("Texas");
        deque.offer("Georgia");
        while (deque.size() > 0)
            System.out.println(deque.remove() + " ");
    }
}
