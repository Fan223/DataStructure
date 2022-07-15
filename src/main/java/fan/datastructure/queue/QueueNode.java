package fan.datastructure.queue;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class QueueNode<T> {
    T val;  // 节点值
    public QueueNode next; // 指向后续节点
    QueueNode(T val) {
        this.val = val;
    }
}
