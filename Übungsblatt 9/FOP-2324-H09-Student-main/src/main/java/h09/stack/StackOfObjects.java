package h09.stack;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * An object of class {@link StackOfObjects} represents a data structure of type stack.
 */
@SuppressWarnings("unchecked")
public class StackOfObjects {

    private int lastIndex = -1;

    private Object[] objects = new Object[1];

    /**
     * Pushes the given object on this stack.
     *
     * @param object the object
     */
    public void push(Object object) {
        increaseIfFull();
        objects[++lastIndex] = object;
    }

    /**
     * Removes and returns the top object of this stack.
     *
     * @return the top object
     */
    public Object pop() {
        checkIfEmpty();
        var e = get(lastIndex);
        lastIndex--;
        return e;
    }

    /**
     * Returns the object at the given index in this stack.
     *
     * @param index the index
     * @return the object
     */
    public Object get(int index) {
        checkIfValid(index);
        return objects[index];
    }

    /**
     * Constructs and returns a stack with the given objects.
     * The last object is the top object.
     *
     * @param objects the objects
     * @return the stack
     */
    public static StackOfObjects of(Object... objects) {
        StackOfObjects stack = new StackOfObjects();
        for (Object object : objects) {
            stack.push(object);
        }
        return stack;
    }

    /**
     * Returns the number of objects in this stack.
     *
     * @return the number of objects
     */
    public int numberOfObjects() {
        return lastIndex + 1;
    }

    private void checkIfValid(int index) {
        if (index < 0 || index > lastIndex) {
            throw new IllegalArgumentException("invalid index for stack of size %d: %d".formatted(numberOfObjects(), index));
        }
    }

    private void checkIfEmpty() {
        if (numberOfObjects() <= 0) {
            throw new IllegalStateException("stack is empty");
        }
    }

    private void increaseIfFull() {
        if (numberOfObjects() >= objects.length) {
            objects = Arrays.copyOf(objects, 2 * objects.length);
        }
    }

    @Override
    public String toString() {
        return IntStream.range(0, lastIndex + 1)
            .mapToObj(i -> objects[i] != null ? objects[i].toString() : "null")
            .collect(Collectors.joining(",\n\t", "[\n\t", "\n]"));
    }
}
