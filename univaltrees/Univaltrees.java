/*
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 */
class Univaltrees{
	public static void main(String[] args){
		Node node = new Node(0,null, null);
		node.left = new Node(1,null, null);
		node.right = new Node(0, null, null);
		node.right.left = new Node(1, null, null);
		node.right.right = new Node(0, null, null);
		node.right.left.right = new Node(1, null, null);
		node.right.left.left = new Node(1, null, null);
		// node.printTree();
		// Integer cnt = Integer.valueOf(1);
		int[] cnt = {0};
		node.cntUnivalTrees(cnt);
		System.out.println(cnt[0]);
	}
}