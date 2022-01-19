package designpattern.visitordp.step1.nodes;

public interface Node {

    public <T> T accept( NodeVisitor<T> nodeVisitor);
}
