package fan.datastructure.stack;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor


public class StackNode<T> {
    T val;  // 节点值
    public StackNode next; // 指向后续节点

    StackNode(T val) {
        this.val = val;
    }
}

