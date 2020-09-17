class Node{
	Node left ;
	Node right ;
	int data;
	Node(int data, Node left, Node right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
	void printTree(){
		if(this != null){
			if(this.left != null)
				this.left.printTree();
			System.out.println(this.data);
			if(this.right != null)
				this.right.printTree();

			
			}
	}
	boolean cntUnivalTrees(int[] cnt)
	{
		// System.out.println(cnt);
		if(this != null){
			if(this.left == null && this.right == null){
				cnt[0]++;
				return true;
			}
			else if(this.left.cntUnivalTrees(cnt) && this.right.cntUnivalTrees(cnt)){
				if(this.left == null){
					if(this.right.data == this.data){
						cnt[0]++;
						return true;
					}
				}
				if(this.right == null){
					if(this.left.data == this.data){
						cnt[0]++;
						return true;
					}
				}

				if(this.left != null && this.right != null){
					if(this.left.data == this.right.data && this.left.data == this.data){
						cnt[0]++;
						return true;
					}
				}
				return false;
			}
		}
		else{
			return true;
		}
		return true;
	}
}

