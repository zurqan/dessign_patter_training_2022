package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.IntValueNode;
import designpattern.visitordp.step2.nodes.NodeVisitor;

public interface IntValueNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(IntValueNode intValueNode);

}
