package designpattern.visitordp.step1.nodes;

public class IntValueNode extends ValueNode<Integer> {
    public IntValueNode(Integer value) {
        super(value);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return nodeVisitor.visit(this);
    }
}
