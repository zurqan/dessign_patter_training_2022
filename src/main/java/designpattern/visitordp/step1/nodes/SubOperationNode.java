package designpattern.visitordp.step1.nodes;

class SubOperationNode extends OperationNode{


    public SubOperationNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return nodeVisitor.visit(this);
    }
}
