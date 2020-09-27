import java.util.Arrays;

public class MaxHeap {
    int size = 1;
    int capacity;
    int[] heap;
    MaxHeap(int capacity)
    {
        this.capacity = capacity+1;
        heap = new int[capacity+1];
    }  
    //adds new element to heap  
    void add(int value)
    {
        ensureCapacity();
        heap[size] = value;
        size++;
        heapifyUp();
    }
    void ensureCapacity()
    {
        if(size == capacity)
        {
            heap = Arrays.copyOf(heap, capacity*2);
        }
    }
    //return max elements
    int peek()
    {
        return size==1?0:heap[1];
    }
    //removes and returns the max element
    int poll()
    {
        System.out.println("size:"+size);
        int max = heap[1];
        heap[1] = heap[size-1];
        size--;
        heapifyDown();
        return max;
    }
    void swap(int childindex, int parentindex)
    {
        int temp = heap[childindex];
        heap[childindex] = heap[parentindex];
        heap[parentindex] = temp;
    }
    //sets the max element at top of the heap
    void heapifyUp()
    {
        int index = size -1;
        while(index/2>0 && heap[index/2]<heap[index])
        {
            swap(index, index/2);
            index = index/2;
        }
    }
    void heapifyDown(){
        int parentindex = 1;
        while(parentindex*2<size)
        {
            int childindex = parentindex*2;
            
            if(parentindex*2+1<size && heap[childindex]<heap[parentindex*2+1])
            {
                childindex = parentindex*2+1;
            }
            if(heap[parentindex]<heap[childindex])
            {
                swap(parentindex, childindex);
            }
            parentindex = childindex;
        }
    }
    void printHeap(){
        for(int i=1;i<capacity;i++)
        {
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
            MaxHeap obj = new MaxHeap(60);
            for(int i=1;i<=50;i++)
            {
                obj.add(i);
            }
            // obj.add(2);
            obj.printHeap();
            System.out.println("\n"+obj.poll()+" \t"+obj.peek()); 
            

    }
    

}
