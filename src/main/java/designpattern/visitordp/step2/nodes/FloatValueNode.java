package designpattern.visitordp.step2.nodes;

public class FloatValueNode extends ValueNode<Float> {
    public FloatValueNode(Float value) {
        super(value);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return
                nodeVisitor instanceof FloatValueNodeVisitor
                        ? ((FloatValueNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;

    }
}
