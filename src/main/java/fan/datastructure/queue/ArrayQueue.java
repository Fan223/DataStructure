package fan.datastructure.queue;

public class ArrayQueue<T> {
    private T[] storage; // 存放队列元素的数组
    private int front; // 队列头
    private int rear; // 队列尾
    private int maxsize; // 队列最大容量

    // 无参构造，默认大小为8
    public ArrayQueue(){
        storage = (T[]) new Object[8];
        front = -1;
        rear = -1;
        maxsize = 8;
    }

    // 带初始大小的构造方法
    public ArrayQueue(int size){
        storage = (T[]) new Object[size];
        front = -1;
        rear = -1;
        maxsize = size;
    }

    // 判断是否队列已满
    public boolean isFull(){
        return rear == maxsize - 1;
    }

    // 判断队列是否为空
    public boolean isEmpty(){
        return front == rear;
    }

    // 入队
    public void enqueue(T val){
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException("队列已满");
        }
        storage[++rear] = val;
    }

    // 遍历队列
    public void queryQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null){
                System.out.print(storage[i] + " ");
            }
        }
        System.out.println();
    }

    // 出队
    public T dequeue(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        T result = storage[++front];
        storage[front] = null;
        return result;
    }

    // 获取队列头元素
    public T peek(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        return storage[front + 1];
    }
}
