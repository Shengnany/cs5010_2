package Problem2;

import java.util.*;

/**
 * This class is an implementation of priority queue
 * @param <E>
 */
public class MyPriorityQueue<E extends Comparable<E>> {
    private List<E> list;
    private int size;

    /**
     * Constructor for priority queue
     */
    public MyPriorityQueue() {
        this.size = 0;
        this.list = new ArrayList<>();
    }

    /**
     * insert the object into the queue. Use the Comparable method
     * compareTo() to implement the ordering.
     * @param e element to be inserted
     * @return element inserted
     */
    public E insert(E e) {
        list.add(e);
        sort(0, size);
        size++;
        return e;
    }

    /**
     * removes and returns the object at the front. Throw an appropriate exception
     * if the Priority Queue is empty.
     * @return element removed
     * @throws EmptyQueueException if the priority queue is empty
     */
    public E remove() throws EmptyQueueException {
        if (size == 0) {
            throw new EmptyQueueException("Empty queue");
        } else {
            size--;
            E e = list.remove(0);
            return e;
        }
    }

    /**
     * returns the object at the front without changing the Priority Queue. Throw and
     * appropriate exception if the Priority Queue is empty.
     * @return element at the front of the priority queue
     * @throws EmptyQueueException if the priority queue is empty
     */
    public E front() throws EmptyQueueException {
        if (size == 0) {
            throw new EmptyQueueException("Empty queue");
        } else {
            E e = list.get(0);
            return e;
        }
    }

    /**
     * check if it is empty
     * @return true if empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * sort the priority queue
     * @param left  start index
     * @param right end index
     */
    private void sort(int left, int right) {
        if (left < right) {
            int pi = partition(left, right);
            sort(left, pi - 1);
            sort(pi + 1, right);
        }

    }

    /**
     * partion method for quick sort
     * @param low start index
     * @param high end index
     * @return pivot
     */
    private int partition(int low, int high) {
        E pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }

    /**
     * swap the two elements
     * @param i object a
     * @param j object b
     */
    private void swap(int i, int j) {
        E temp = list.get(j);
        list.set(j, list.get(i));
        list.set(i, temp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPriorityQueue)) return false;
        MyPriorityQueue<?> that = (MyPriorityQueue<?>) o;
        return size == that.size && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, size);
    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "list=" + list +
                ", size=" + size +
                '}';
    }
}

