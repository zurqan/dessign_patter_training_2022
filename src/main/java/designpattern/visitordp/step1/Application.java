package designpattern.visitordp.step1;

import designpattern.visitordp.step1.nodes.Node;
import designpattern.visitordp.step1.nodes.NodeBuilder;
import designpattern.visitordp.step1.nodes.NodeEvaluationVisitor;
import designpattern.visitordp.step1.nodes.NodeFormatVisitor;
import designpattern.visitordp.step2.nodes.*;
import sun.jvm.hotspot.utilities.IntervalNode;

import static designpattern.visitordp.step1.nodes.NodeBuilder.intNode;

public class Application {

    public static void main(String[] args) {
        Node node = NodeBuilder
                .intValue(4)
                .add(intNode(5))
                .multiply(intNode(9))
                .sub(NodeBuilder.intValue(3).multiply(intNode(5)).build())
                .divide(intNode(3))
                .build();

        NodeFormatVisitor nodeVisitor = new NodeFormatVisitor();
        String data = node.accept(nodeVisitor);
        System.out.println(data);

        NodeEvaluationVisitor nodeEvaluationVisitor = new NodeEvaluationVisitor();
        Double value = node.accept(nodeEvaluationVisitor);
        System.out.println(value);
    }

    public static void main2(String[] args) {
        IntValueNode left = new IntValueNode(4);
        IntValueNode right = new IntValueNode(5);
        AddOperationNode addOperationNode = new AddOperationNode(left, right);
        MultiplyOperationNode multiplyOperationNode = new MultiplyOperationNode(addOperationNode, new IntValueNode(9));

        //for sub
        MultiplyOperationNode forSub = new MultiplyOperationNode(new IntValueNode(3), new IntValueNode(5));

        SubOperationNode subOperationNode = new SubOperationNode(multiplyOperationNode, forSub);
        DivideOperationNode finalNode = new DivideOperationNode(subOperationNode, new IntValueNode(3));
    }
}
