package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.MultiplyOperationNode;
import designpattern.visitordp.step2.nodes.NodeVisitor;

public interface MultiplyOperationNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(MultiplyOperationNode multiplyOperationNode);

}
