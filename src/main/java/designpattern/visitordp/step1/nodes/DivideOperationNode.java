package designpattern.visitordp.step1.nodes;

class DivideOperationNode extends OperationNode{


    public DivideOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return nodeVisitor.visit(this);
    }
}
