package designpattern.visitordp.step2.nodes;

public class DivideOperationNode extends OperationNode {


    public DivideOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return
                nodeVisitor instanceof DivideOperationNodeVisitor
                        ? ((DivideOperationNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;
    }
}
