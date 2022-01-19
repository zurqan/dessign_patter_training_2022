package designpattern.visitordp.step2.nodes;

import designpattern.visitordp.step2.nodes.FloatValueNode;
import designpattern.visitordp.step2.nodes.NodeVisitor;

public interface FloatValueNodeVisitor<T> extends NodeVisitor<T> {

    public T visit(FloatValueNode floatValueNode);

}
