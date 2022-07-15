package fan.datastructure.linkedlist;

public class DoubleLinkedNodeTest {
    public static void main(String[] args) throws Exception {
        DoubleLinkedNode<Object> doubleLinkedNode = new DoubleLinkedNode<>();
        doubleLinkedNode.addFirst("张三"); // 张三
        doubleLinkedNode.addFirst(1); // 1 张三
        doubleLinkedNode.queryAll();

        doubleLinkedNode.addLast("李四"); // 1 张三 李四
        doubleLinkedNode.queryAll();

        doubleLinkedNode.addIndex("王五", 3); // 1 张三 王五 李四

        doubleLinkedNode.queryAll();
        System.out.println("长度：" + doubleLinkedNode.getLength());
    }
}
