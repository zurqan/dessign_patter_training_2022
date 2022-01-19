package designpattern.visitordp.step2.nodes;

public abstract class ValueNode<T> implements Node {

    public final T value;

    public ValueNode(T value) {
        this.value = value;
    }
}
