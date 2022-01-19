package designpattern.visitordp.step2.nodes;

public class MultiplyOperationNode extends OperationNode {


    public MultiplyOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {

        return
                nodeVisitor instanceof MultiplyOperationNodeVisitor
                        ? ((MultiplyOperationNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;

    }
}
