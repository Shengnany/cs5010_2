package Problem1;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    int nums[] = {1,2};
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    Stack<Integer> stack3;

    @BeforeEach
    void setUp() {
//        stack1 = new StackImpl<>();
        for(int i=0; i<nums.length; i++){
            stack1.push(nums[i]);
        }
//        stack2 = new StackImpl<>();
        for(int i=0; i<nums.length; i++){
            stack2.push(nums[i]);
        }
//        stack3 = new StackImpl<>();
        for(int i=0; i<nums.length; i++){
            stack3.push(nums[i]);
        }
    }

    @Test
    public void testPush() {
        Stack newStack = stack1.push(3);
        assertEquals(3,newStack.top());
        Stack newStack2 = newStack.remove();
        assertEquals(2,newStack2.top());
    }

    @Test
    public void testRemove() {
        Stack newStack = stack2.remove();
        assertEquals(1,newStack.top());
    }

    @Test
    public void testFront() {
        assertEquals(1,stack3.top());
        Stack newStack = stack3.push(3);
        assertEquals(3,newStack.top());
    }
}