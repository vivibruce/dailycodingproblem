import java.util.*;
class BTArray{
	int size=0;
	int[] tree;
	int capacity;
	BTArray(int capacity)
	{
		this.capacity=capacity;
		tree = new int[capacity+1];
	}
	void insert(int value)
	{
		int index = 1;
		if(size==0)
		{
			tree[index]=value;
			size++;
		}
		else{
		while(size<=capacity&&index<=capacity)
		{
			if(tree[index]>value)
			{
				if(tree[index*2]==0)
				{
					tree[index*2]=value;
					size++;
					break;
				}
				else{
					index = index*2;
				}

			}
			else{
				if(tree[index*2+1]==0)
				{
					tree[index*2+1]=value;
					size++;
					break;
				}
				else{
					index = index*2+1;
				}
			}
		}
		}
	}
	void print()
	{
		for(int i=0;i<=capacity;i++)
		{
			System.out.print(tree[i]+" ");
		}
	}
	int getParent(int childindex)
	{
		return tree[Math.floorDiv(childindex, 2)];
	}
	public static void main(String[] args) {
		BTArray t = new BTArray(10);
		t.insert(5);t.insert(3);t.insert(4);t.insert(7);t.insert(8);t.insert(6);
		t.print();
		System.out.println("\n"+t.getParent(3));
	}
}