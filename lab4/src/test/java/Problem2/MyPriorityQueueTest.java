package Problem2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPriorityQueueTest {
    MyPriorityQueue<Integer> pq1;
    MyPriorityQueue pq2;
    MyPriorityQueue pq3;
    MyPriorityQueue pq4;

    @BeforeEach
    void setUp() {
        pq1 = new MyPriorityQueue();
        pq2 = new MyPriorityQueue();
        pq3  = new MyPriorityQueue();
        pq4  = new MyPriorityQueue();
    }

    @Test
    void insert() throws EmptyQueueException {
        pq1.insert(2);
        pq1.insert(3);
        pq1.insert(1);
        assertEquals(1,pq1.front());
    }

    @Test
    void remove() throws EmptyQueueException {
        pq2.insert(2);
        pq2.insert(3);
        pq2.insert(1);
        Integer num1 = (Integer) pq2.remove();
        assertEquals(num1,1);
        Assertions.assertThrows(EmptyQueueException.class, () -> {
            pq3.front();}
        );
    }

    @Test
    void front() throws EmptyQueueException {
        pq4.insert(3);
        pq4.insert(1);
        Assertions.assertEquals(1,pq4.front());
        Assertions.assertThrows(EmptyQueueException.class, () -> {
            pq3.front();}
        );
     }


    @Test
    void isEmpty() {
        boolean empty = pq3.isEmpty();
        Assertions.assertTrue(empty);
    }
}