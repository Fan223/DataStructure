package fan.datastructure.queue;

public class CircularArrayQueue<T> {
    private T[] storage; // 存放队列元素的数组
    private int front; // 队列头
    private int rear; // 队列尾
    private int maxsize; // 队列最大容量

    // 无参构造，默认大小为8
    public CircularArrayQueue() {
        storage = (T[]) new Object[8];
        maxsize = 8;
        // front = 0; 指向第一个元素,默认是0可以不写
        // rear = 0;  指向最后一个元素的下一位，默认是0可以不写
    }

    // 带初始大小的构造方法
    public CircularArrayQueue(int size) {
        storage = (T[]) new Object[size];
        maxsize = size;
        // front = 0; 指向第一个元素,默认是0可以不写
        // rear = 0;  指向最后一个元素的下一位，默认是0可以不写
    }

    // 判断是否队列已满
    public boolean isFull() {
        return (rear + 1) % maxsize == front;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    // 入队
    public void enqueue(T val) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("队列已满");
        }
        storage[rear] = val;
        rear = (rear + 1) % maxsize;
    }

    // 求出当前有效数据
    public int getEffectiveSize() {
        return (rear + maxsize - front) % maxsize;
    }

    //遍历
    public void queryQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = front; i < front + getEffectiveSize(); i++) {
            System.out.print(storage[i % maxsize] + " ");
        }
        System.out.println();
    }

    // 出队
    public T dequeue() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        T val = storage[front];
        storage[front] = null;
        front = (front + 1) % maxsize;
        return val;
    }

    // 取队首元素
    public T getFront() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        return storage[front];
    }

    // 取队尾元素
    public T getRear() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        return storage[(rear - 1 + maxsize) % maxsize];
    }
}
