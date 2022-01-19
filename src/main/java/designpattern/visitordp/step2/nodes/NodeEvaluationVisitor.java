package designpattern.visitordp.step2.nodes;



public class NodeEvaluationVisitor implements IntValueNodeVisitor<Double>,FloatValueNodeVisitor<Double>,AddOperationNodeVisitor<Double>,
        MultiplyOperationNodeVisitor<Double>,DivideOperationNodeVisitor<Double>,SubtractOperationNodeVisitor<Double>{

    @Override
    public Double visit(IntValueNode intValueNode) {
        return Double.valueOf( intValueNode.value);
    }

    @Override
    public Double visit(FloatValueNode floatValueNode) {
        return Double.valueOf(floatValueNode.value);
    }

    @Override
    public Double visit(AddOperationNode addOperationNode) {
        return addOperationNode.left.accept(this)+addOperationNode.right.accept(this);
    }

    @Override
    public Double visit(SubOperationNode subOperationNode) {
        return subOperationNode.left.accept(this)-subOperationNode.right.accept(this);
    }

    @Override
    public Double visit(MultiplyOperationNode multiplyOperationNode) {
        return multiplyOperationNode.left.accept(this)*multiplyOperationNode.right.accept(this);
    }

    @Override
    public Double visit(DivideOperationNode divideOperationNode) {
        return divideOperationNode.left.accept(this)/divideOperationNode.right.accept(this);
    }
}
