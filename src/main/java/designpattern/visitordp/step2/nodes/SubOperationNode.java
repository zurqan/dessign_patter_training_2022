package designpattern.visitordp.step2.nodes;

public class SubOperationNode extends OperationNode {


    public SubOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {

        return
                nodeVisitor instanceof SubtractOperationNodeVisitor
                        ? ((SubtractOperationNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;

    }
}
