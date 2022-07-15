package fan.datastructure.linkedlist;

public class DoubleLinkedNode<T> {
    private DoubleNode head;
    private DoubleNode last;
    private int length;

    public DoubleLinkedNode(){
        length = 0;
    }

    // 遍历
    public void queryAll(){
        DoubleNode currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // 获取长度
    public int getLength(){
        return length;
    }

    // 头插法
    public void addFirst(T val){
        // 插入的节点
        DoubleNode addNode = new DoubleNode(val);

        // 加入链表为空，则插入的节点就是头节点和尾结点
        if (head == null){
            head = addNode;
            last = addNode;
            length ++;
        } else {
            // 让添加节点的下一个节点为头结点
            addNode.next = head;
            // 再让头结点的上一个为添加节点
            head.prev = addNode;
            // 再把头节点设为添加节点
            head = addNode;
            length ++;
        }
    }

    // 尾插法
    public void addLast(T val){
        DoubleNode addNode = new DoubleNode(val);

        if (head == null){
            head = addNode;
            last = addNode;
            length ++;
        } else {
            // 让尾结点的下一个节点为添加节点
            last.next = addNode;
            // 再让添加节点的上一个为尾结点
            addNode.prev = last;
            // 再把尾结点设为添加节点
            last = addNode;
            length ++;
        }
    }

    // 在任意位置插入
    public void addIndex(T val, int index) throws Exception {
        // 假如添加位置为头结点位置，就是头插法
        if (index <= 0){
            addFirst(val);
            return;
        }
        // 假如添加位置为尾结点的位置，就是尾插法
        if (index > length){
            addLast(val);
            return;
        }

        DoubleNode addNode = new DoubleNode(val);
        DoubleNode currentNode = head;
        // 找到指定位置的节点
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        // 让添加节点的下一个节点为指定位置的节点
        addNode.next = currentNode;
        // 让指定位置节点的上一个节点的下一个节点为添加节点，即在指定位置插入添加节点
        currentNode.prev.next = addNode;
        // 再让添加节点的上一个节点为指定位置节点的上一个节点
        addNode.prev = currentNode.prev;
        // 再让指定位置的上一个节点为添加节点
        currentNode.prev = addNode;
        length ++;
    }
}
