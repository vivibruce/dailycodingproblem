
public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(){}
    Node insert(int data, Node node){
            Node new_node = new Node(data);
            new_node.next = node;
            return new_node;
    }
    void display(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
