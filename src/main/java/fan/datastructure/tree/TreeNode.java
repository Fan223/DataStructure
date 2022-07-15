package fan.datastructure.tree;

import lombok.Data;

@Data
public class TreeNode {
    public Integer data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }
}
