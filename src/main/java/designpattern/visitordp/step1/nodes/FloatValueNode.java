package designpattern.visitordp.step1.nodes;

public class FloatValueNode extends ValueNode<Float> {
    public FloatValueNode(Float value) {
        super(value);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return nodeVisitor.visit(this);
    }
}
