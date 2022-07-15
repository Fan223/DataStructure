package fan.datastructure.stack;

import java.util.Arrays;

public class MyStack<T> {
    private T[] storage; // 存放栈中元素的数组
    private int capacity; // 栈的容量
    private int count; // 栈中元素数量
    private static final int GROW_FACTOR = 2; // 扩容倍数

    // 无参构造方法。默认容量为 8
    public MyStack(){
        capacity = 8;
        storage = (T[]) new Object[8];
        count = 0;
    }

    // 带初始容量的构造方法
    public MyStack(int initialCapacity){
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Capacity too small.");
        }
        capacity = initialCapacity;
        storage = (T[]) new Object[initialCapacity];
        count = 0;
    }

    // 入栈
    public void push(T val){
        if (count == capacity){
            expansion();
        }
        storage[count++] = val;
    }

    // 扩容，使用 Arrays.copyOf() 复制原数组并扩容
    public void expansion(){
        int newCapacity = capacity * GROW_FACTOR;
        storage = Arrays.copyOf(storage, newCapacity);
        capacity = newCapacity;
    }

    // 返回栈顶元素并出栈
    public T pop(){
        if (count == 0) {
            throw new IllegalArgumentException("Stack is empty.");
        }
        return storage[--count];
    }

    // 返回栈顶元素不出栈
    public T peek(){
        if (count == 0){
            throw new IllegalArgumentException("Stack is empty.");
        } else {
            return storage[count - 1];
        }
    }

    // 判断栈是否为空
    public boolean isEmpty(){
        return count == 0;
    }

    // 返回栈中元素的个数
    public int size(){
        return count;
    }
}
