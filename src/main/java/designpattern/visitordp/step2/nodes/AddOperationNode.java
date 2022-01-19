package designpattern.visitordp.step2.nodes;

public class AddOperationNode extends OperationNode {


    public AddOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return
                nodeVisitor instanceof AddOperationNodeVisitor
                        ? ((AddOperationNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;

    }
}
