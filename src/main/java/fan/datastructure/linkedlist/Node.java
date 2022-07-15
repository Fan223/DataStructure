package fan.datastructure.linkedlist;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Node<T> {
    T val;  // 节点值
    public Node next; // 指向后续节点
    Node(T val) {
        this.val = val;
    }
}
