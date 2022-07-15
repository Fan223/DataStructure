package fan.datastructure.queue;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<Object> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1); // 1
        linkedQueue.enqueue("张三"); // 张三 1
        linkedQueue.enqueue(2); // 2 张三 1
        linkedQueue.enqueue("李四"); // 李四 2 张三 1

        System.out.println("出队元素：" + linkedQueue.dequeue()); // 1
        System.out.println("队头元素：" + linkedQueue.getHead()); // 张三
        System.out.println("队尾元素：" + linkedQueue.getLast()); // 李四
        System.out.println("出队元素：" + linkedQueue.dequeue()); // 张三

        linkedQueue.queryQueue();
        System.out.println("队列长度：" + linkedQueue.getLength()); // 2
    }
}
