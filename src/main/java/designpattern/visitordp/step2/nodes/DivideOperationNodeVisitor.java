package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.DivideOperationNode;
import designpattern.visitordp.step2.nodes.NodeVisitor;

public interface DivideOperationNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(DivideOperationNode divideOperationNode);

}
