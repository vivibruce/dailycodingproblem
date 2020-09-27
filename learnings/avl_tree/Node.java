public class Node {
    Node left, right;
    int data;
    int height;
    public Node(int data)
    {
        this.data = data;
        this.height =1;
    }
    public Node(){}
    void insert( int data){
        if(this == null){
            this.data = data;
        }
        else if(this.data>data)
        {
            if(this.left == null)
                this.left = new Node(data);
            else
                this.left.insert(data);
        }
        else if(this.data<data){
            if(this.right == null)
                this.right = new Node(data);
            else
                this.right.insert(data);
        }
    }
    void inOrder(){
        if(this!=null)
        {
            if(this.left!=null)
                this.left.inOrder();
            System.out.println(this.data);
            if(this.right!=null)
                this.right.inOrder();
        }
    }
    public static void main(String[] args) {
        Node root =null ;
        if(root == null)
        {
            root = new Node(4);
        }
        root.insert(5);
        root.insert(2);
        root.insert(3);
        root.insert(7);
        root.inOrder();
        
    }
}


