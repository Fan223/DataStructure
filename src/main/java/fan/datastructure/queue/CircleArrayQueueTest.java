package fan.datastructure.queue;

public class CircleArrayQueueTest {
    public static void main(String[] args) {
        CircularArrayQueue<Object> circularArrayQueue = new CircularArrayQueue<>(4);

        circularArrayQueue.enqueue(1); // 1
        circularArrayQueue.enqueue("张三"); // 张三 1
        circularArrayQueue.enqueue("李四"); // 李四 张三 1

        System.out.println("出队元素：" + circularArrayQueue.dequeue());
        System.out.println("队头元素：" + circularArrayQueue.getFront());
        System.out.println("出队元素：" + circularArrayQueue.dequeue());
        circularArrayQueue.queryQueue();

        circularArrayQueue.enqueue("王五"); // 王五 李四
        circularArrayQueue.enqueue("赵六"); // 赵六 王五 李四
        circularArrayQueue.queryQueue();

        System.out.println("队尾元素：" + circularArrayQueue.getRear());
    }
}
