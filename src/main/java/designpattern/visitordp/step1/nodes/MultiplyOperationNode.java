package designpattern.visitordp.step1.nodes;

class MultiplyOperationNode extends OperationNode{


    public MultiplyOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return nodeVisitor.visit(this);
    }
}
