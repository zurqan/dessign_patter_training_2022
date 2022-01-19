package designpattern.visitordp.step1.nodes;

public class NodeFormatVisitor implements NodeVisitor<String> {

    @Override
    public String visit(IntValueNode intValueNode) {
        return " "+Integer.toString(intValueNode.value)+ " ";

    }

    @Override
    public String visit(FloatValueNode floatValueNode) {
        return " "+Float.toString(floatValueNode.value)+" ";

    }

    @Override
    public String visit(AddOperationNode addOperationNode) {

        StringBuilder strBuilder = new StringBuilder();

        return strBuilder
                .append("(")
                .append(addOperationNode.left.accept(this))
                .append("+")
                .append(addOperationNode.right.accept(this))
                .append(")")
                .toString();

    }

    @Override
    public String visit(SubOperationNode subOperationNode) {
        StringBuilder strBuilder = new StringBuilder();

        return strBuilder
                .append("(")
                .append(subOperationNode.left.accept(this))
                .append("-")
                .append(subOperationNode.right.accept(this))
                .append(")")
                .toString();
    }

    @Override
    public String visit(MultiplyOperationNode multiplyOperationNode) {
        StringBuilder strBuilder = new StringBuilder();

        return strBuilder
                .append("(")
                .append(multiplyOperationNode.left.accept(this))
                .append("*")
                .append(multiplyOperationNode.right.accept(this))
                .append(")")
                .toString();


    }

    @Override
    public String visit(DivideOperationNode divideOperationNode) {
        StringBuilder strBuilder = new StringBuilder();

        return strBuilder
                .append("(")
                .append(divideOperationNode.left.accept(this))
                .append("/")
                .append(divideOperationNode.right.accept(this))
                .append(")")
                .toString();


    }
}
