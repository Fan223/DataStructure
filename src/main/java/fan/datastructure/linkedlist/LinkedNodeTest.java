package fan.datastructure.linkedlist;

public class LinkedNodeTest {
    public static void main(String[] args) {
        LinkedNode linkedNode = new LinkedNode();
//        LinkNode<String> linkNode = new LinkNode<>(); // 限制泛型

        linkedNode.insert("张三11");
        linkedNode.insert(22);
        linkedNode.insert("王五33");

        for (Object o : linkedNode) {
            System.out.print(o + " ");
        }

        System.out.println();

        linkedNode.insert("赵六", 2);
        for (Object o : linkedNode) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("删除的元素：" + linkedNode.remove(3));
        for (Object o : linkedNode) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println(linkedNode.indexOf("赵六"));
    }
}
