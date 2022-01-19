package designpattern.visitordp.step2;

import designpattern.visitordp.step2.nodes.Node;
import designpattern.visitordp.step2.nodes.NodeBuilder;
import designpattern.visitordp.step2.nodes.NodeEvaluationVisitor;
import designpattern.visitordp.step2.nodes.NodeFormatVisitor;

import static designpattern.visitordp.step2.nodes.NodeBuilder.intNode;


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
}
