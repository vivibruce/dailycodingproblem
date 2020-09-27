/*
Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects
*/
public class LinkedList{
    public static void main(String[] args) {
        // Node node = new Node(2);
        Node head = new Node(0);
        for(int i = 1;i<5;i++)
        {
            head = head.insert(i, head);
        }
        head.display(head);
        Node head2 = new Node(0);
       for(int i=5;i>0;i--){
           head2 = head2.insert(i, head2);
       }
    
        head2.display(head2);
        int result= find_intersection(head, head2);
        System.out.println("result "+ result);
    }
    static int find_intersection(Node head1, Node head2)
    {
        int c1 = count(head1);
        int c2 = count(head2);
        int diff = c1>c2?c1-c2:c2-c1;
        
        if(c1>c2){
            while(diff!=0){
                head1 = head1.next;
                diff--;
            }
        }
        else{
            while(diff!=0){
                head2 = head2.next;
                diff--;
            }
        }
        
        while(head1!=null && head2!=null && head1.data != head2.data)
        {
            head1 = head1.next;
            head2 = head2.next;
        }
        
        if(head1!=null && head2!=null)
        {
            return head1.data;
        }
        return -1;
    }
    static int count(Node node)
    {
        int c=0;
        while(node!=null)
        {
            c++;
            node = node.next;
        }
        return c;
    }
    

    

}
