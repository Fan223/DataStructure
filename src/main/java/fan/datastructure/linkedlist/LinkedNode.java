package fan.datastructure.linkedlist;

import java.util.Iterator;

public class LinkedNode<T> implements Iterable<T> {
    private Node headNode; // 头结点，链表的 headNode 是不可以动的
    private int length; // 结点个数

    public LinkedNode() {
        headNode = new Node();
        length = 0;
    }

    // 清空
    public void clear() {
        headNode.next = null; // 头节点 next 为 null 就是空链表
        headNode.val = null;
        length = 0;
    }

    // 是否非空
    public boolean isEmpty() {
        return length == 0;
    }

    // 获取长度
    public int length() {
        return length;
    }

    // 读取链表第 i 位置的元素值并返回
    public T get(int index) {
        if (index < 0 || index > length) {
            System.out.println("不存在该位置");
        }

        // 头指针不可以移动，不然就无法再找到链表
        // 定义一个临时的Node也指向头指针，通过该指针来进行操作
        Node<T> currentNode = headNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    // 插入到链表末尾
    public void insert(T val) {
        Node<T> addNode = new Node<>(val);

        Node currentNode = headNode;

        // 找到最后一个节点
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = addNode;
        length++;
    }

    // 插入到 i 位置
    public void insert(T val, int index) {
        if (index < 0 || index > length) {
            System.out.println("不存在该位置");
        }

        Node currentNode = headNode;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node<T> addNode = new Node<>(val);
        addNode.next = currentNode.next;
        currentNode.next = addNode;
        length++;
    }

    // 移除并返回 i 位置的元素值
    public T remove(int index) {
        if (index < 0 || index > length) {
            System.out.println("不存在该位置");
        }

        Node currentNode = headNode;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        // 要删除的节点
        Node<T> delCurrent = currentNode.next;

        currentNode.next = delCurrent.next;
        length--;
        return delCurrent.val;
    }

    // 查找元素在链表中第一次出现的位置，索引值
    public int indexOf(T value) {
        Node currentNode = headNode;

        for (int i = 0; currentNode.next != null; i++) {
            currentNode = currentNode.next;
            if (currentNode.val.equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node currentNode = headNode;

            @Override
            public boolean hasNext() {
                return currentNode.next != null;
            }

            @Override
            public T next() {
                currentNode = currentNode.next;
                return (T) currentNode.val;
            }
        };
    }
}
