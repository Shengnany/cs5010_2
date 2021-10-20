package Problem1;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
    int nums[] = {1,2};
    Queue<Integer> queue;
    Queue<Integer> queue2;
    Queue<Integer> queue3;

    @BeforeEach
    void setUp() {
//        queue = new QueueImpl<>();
        for(int i=0; i<nums.length; i++){
            queue.enqueue(nums[i]);
        }
//        queue2 = new QueueImpl<>();
        for(int i=0; i<nums.length; i++){
            queue.enqueue(nums[i]);
        }
//        queue3 = new QueueImpl<>();
        for(int i=0; i<nums.length; i++){
            queue.enqueue(nums[i]);
        }
    }

    @Test
    public void testEnqueue() {
        Queue newQueue = queue.enqueue(3);
        assertEquals(1,newQueue.front());
        Queue newQueue2 = newQueue.dequeue();
        Queue newQueue3 = newQueue2.dequeue();
        assertEquals(3,newQueue3.front());
    }

    @Test
    public void testDequeue() {
        Queue newQueue = queue2.dequeue();
        assertEquals(2,newQueue.front());
    }

    @Test
    public void testFront() {
        assertEquals(1,queue3.front());
        Queue newQueue = queue3.enqueue(3);
        assertEquals(1,newQueue.front());
    }
}