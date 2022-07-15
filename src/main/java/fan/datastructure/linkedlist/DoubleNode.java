package fan.datastructure.linkedlist;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DoubleNode<T> {
    T val;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(T val) {
        this.val = val;
    }
}
