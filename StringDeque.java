import java.util.Deque;
import java.util.ArrayDeque;

public class StringDeque {
    public static void main(String[] args)  
        // Create a Deque of Strings
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements using add()
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        deque.add("Date");

        System.out.println("Deque after additions: " + deque);

        // Removing head element using remove() (throws exception if empty)
        String removedHead = deque.remove();
        System.out.println("Removed head element using remove(): " + removedHead);
        System.out.println("Deque after remove(): " + deque);

        // Removing head element using poll() (returns null if empty)
        String polledHead = deque.poll();
        System.out.println("Removed head element using poll(): " + polledHead);
        System.out.println("Deque after poll(): " + deque);

        // Removing tail element using pollLast() (returns null if empty)
        String polledLast = deque.pollLast();
        System.out.println("Removed last element using pollLast(): " + polledLast);
        System.out.println("Deque after pollLast(): " + deque);
    }
}

