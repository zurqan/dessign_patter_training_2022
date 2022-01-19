package designpattern.visitordp.step2.nodes;

public interface Node {

    public <T> T accept(NodeVisitor<T> nodeVisitor);
}
