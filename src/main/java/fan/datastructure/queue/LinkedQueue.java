package fan.datastructure.queue;

public class LinkedQueue<T> {
    private QueueNode head;
    private QueueNode last;
    private int length;

    public LinkedQueue() {
        length = 0;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return length == 0;
    }

    // 入队
    public void enqueue(T val) {
        QueueNode node = new QueueNode(val);

        if (isEmpty()) {
            head = node;
            last = node;
        } else {
            last.next = node;
        }
        last = node;
        length++;
    }

    // 遍历队列
    public void queryQueue() {
        QueueNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // 出队
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T val = (T) head.val;
        head = head.next;
        length--;
        return val;
    }

    // 获取队列长度
    public int getLength() {
        return length;
    }

    // 获取队列头元素
    public T getHead() {
        if (isEmpty()) {
            return null;
        }
        return (T) head.val;
    }

    // 获取队列尾元素
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return (T) last.val;
    }
}
