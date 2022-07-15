package fan.datastructure.stack;

import fan.datastructure.linkedlist.Node;

public class LinkedStack<T> {
    private StackNode head;
    private int length;

    public LinkedStack() {
        head = new StackNode();
        length = 0;
    }

    // 清空
    public void clear() {
        head.next = null;
        head.val = null;
        length = 0;
    }

    // 入栈，头插法
    public void push(T val) {
        StackNode addNode = new StackNode(val);
        if (head.val == null) {
            head = addNode;
        } else {
            addNode.next = head;
            head = addNode;
        }
        length++;
    }

    // 出栈，将头结点指向下一个，并返回值
    public T pop() {
        T val = (T) head.val;
        head = head.next;
        length--;
        return val;
    }

    public int getLength() {
        return length;
    }

    public T peek() {
        return (T) head.val;
    }

    public void queryAll() {
        StackNode currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
