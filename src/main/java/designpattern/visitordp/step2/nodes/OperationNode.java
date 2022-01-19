package designpattern.visitordp.step2.nodes;

public abstract class OperationNode implements Node {

    public final Node left;
    public final Node right;

    public OperationNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }



}
