package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.NodeVisitor;
import designpattern.visitordp.step2.nodes.SubOperationNode;

public interface SubtractOperationNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(SubOperationNode subOperationNode);

}
