import java.util.ArrayList;
import java.util.Random;

/**
 * Generic Bag class.
 * @param <T> The type of elements in the bag.
 */
public class Bag<T> {
    private ArrayList<T> elements;

    public Bag() {
        elements = new ArrayList<>();
    }

    // Add an element to the bag
    public void add(T item) {
        elements.add(item);
    }

    // Clear the bag
    public void clear() {
        elements.clear();
    }

    // Check if the bag contains an item
    public boolean contains(T item) {
        return elements.contains(item);
    }

    // Grab a random element from the bag
    public T grab() {
        if (isEmpty()) {
            return null;
        }
        Random random = new Random();
        return elements.get(random.nextInt(elements.size()));
    }

    // Check if the bag is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Remove an item from the bag
    public boolean remove(T item) {
        return elements.remove(item);
    }

    // Get the size of the bag
    public int size() {
        return elements.size();
    }

    // Convert the bag to an array
    public Object[] toArray() {
        return elements.toArray();
    }

    // Get a string representation of the bag
    public String toString() {
        return elements.toString();
    }
}
