package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.AddOperationNode;
import designpattern.visitordp.step2.nodes.NodeVisitor;

public interface AddOperationNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(AddOperationNode addOperationNode);

}
