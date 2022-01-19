package designpattern.visitordp.step2.nodes;

public class NodeBuilder {

    private Node node;

    public NodeBuilder(Node node) {
        this.node = node;
    }

    public static NodeBuilder intValue(int value){
        return new NodeBuilder(new IntValueNode(value));
    }

    public static NodeBuilder floatValue(float value){
        return new NodeBuilder(new FloatValueNode(value));
    }

    public NodeBuilder add(Node another){
        this.node=new AddOperationNode(node,another);
        return this;
    }

    public NodeBuilder sub(Node another){
        this.node=new SubOperationNode(node,another);
        return this;
    }

    public NodeBuilder multiply(Node another){
        this.node=new MultiplyOperationNode(node,another);
        return this;
    }

    public NodeBuilder divide(Node another){
        this.node=new DivideOperationNode(node,another);
        return this;
    }

    public Node build(){
        return node;
    }



    public static Node intNode(int value) {
        return NodeBuilder.intValue(value).build();
    }

    public static Node floatNode(float value) {
        return NodeBuilder.floatValue(value).build();
    }
}
