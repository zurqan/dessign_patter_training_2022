package designpattern.visitordp.step2.nodes;

public class IntValueNode extends ValueNode<Integer> {
    public IntValueNode(Integer value) {
        super(value);
    }

    @Override
    public <T> T accept(NodeVisitor<T> nodeVisitor) {
        return
                nodeVisitor instanceof IntValueNodeVisitor
                        ? ((IntValueNodeVisitor<T>) nodeVisitor).visit(this)
                        : null;
    }
}
