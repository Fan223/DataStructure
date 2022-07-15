package fan.datastructure.linkedlist;

public class NodeTest {
    public static void main(String[] args) throws Exception {
        Node head = new Node();
        Node node1 = new Node<>("王五");
        Node node2 = new Node<>(1);

        Node node3 = new Node<>("李四");
        Node node4 = new Node<>(2);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node addNode = new Node("赵六");
        head = add(head, addNode);

        Node addIndexNode = new Node("11");
        head = add(head, addIndexNode, 2);

//        head = delete(head, 4);
        queryAll(head);
    }

    public static Node delete(Node head, int index) throws Exception {
        Node currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next != null ? currentNode.next : null;
            if (currentNode == null) {
                throw new Exception("位置不存在");
            }
        }
        Node delNode = currentNode.next;
        currentNode.next = delNode.next;
        return head;
    }

    public static Node add(Node head, Node addNode, int index) throws Exception {
        Node currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next != null ? currentNode.next : null;
            if (currentNode == null) {
                throw new Exception("位置不存在");
            }
        }

        addNode.next = currentNode.next;
        currentNode.next = addNode;
        return head;
    }

    public static Node add(Node head, Node addNode) {
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = addNode;
        return head;
    }

    public static void queryAll(Node node) {
        Node currentNode = node;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.val);
        }
    }
}
