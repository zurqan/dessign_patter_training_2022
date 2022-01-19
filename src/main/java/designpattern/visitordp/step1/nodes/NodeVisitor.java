package designpattern.visitordp.step1.nodes;

public interface NodeVisitor<T> {

    public T visit(IntValueNode intValueNode);
    public T visit(FloatValueNode floatValueNode);
    public T visit(AddOperationNode addOperationNode);
    public T visit(SubOperationNode subOperationNode);
    public T visit(MultiplyOperationNode multiplyOperationNode);
    public T visit(DivideOperationNode divideOperationNode);
}
