package fan.datastructure.queue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Object> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(1); // 1
        arrayQueue.enqueue("张三"); // 张三 1
        arrayQueue.enqueue(2); // 2 张三 1
        arrayQueue.enqueue("李四"); // 李四 2 张三 1

        System.out.println("队列是否已满：" + arrayQueue.isFull()); // false

        System.out.println("出队元素：" + arrayQueue.dequeue());
        System.out.println("出队元素：" + arrayQueue.dequeue());
        System.out.println("获取队头元素不出队：" + arrayQueue.peek());

        arrayQueue.queryQueue();

        System.out.println("出队元素：" + arrayQueue.dequeue());
        System.out.println("出队元素：" + arrayQueue.dequeue());
        System.out.println("队列是否为空：" + arrayQueue.isEmpty());
    }
}
