public class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
    void add(int data)
    {
        Node newNode = new Node(data);
        Node temp =this;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void deleteKFromLast(int k)
    {
        Node first = this;
        Node last = first;
        int c=0;
        while(first.next!=null)
        {
            first = first.next;
            if(c>=k)
            {
                last = last.next;
            }
            else{
                c++;
            }
        }
        last.next = last.next.next;
    }
    void printList()
    {
        Node temp = this;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        for(int i=2;i<=10;i++)
        {
            head.add(i);
        }
        head.deleteKFromLast(3);
        head.printList();
    }
}
