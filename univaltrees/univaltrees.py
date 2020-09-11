'''
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
'''
class Value:
	def __init__(self):
		self.count = 0
class Node:
	def __init__(self, data):
		self.left = None
		self.right = None
		self.data = data

	def insert(self, data):
		if self.data >= data:
			if self.left is None:
				self.left = Node(data)
			else:
				self.left.insert(data)
		elif self.data < data:
			if self.right is None:
				self.right = Node(data)
			else:
				self.right.insert(data)
	def PrintTree(self):
		if self.left:
			self.left.PrintTree()
		print(self.data)
		if self.right:
			self.right.PrintTree()

	def cntUnivalTrees(self,cntobj):
		# print(self.data, cntobj.count)
		if self is not None:
			if self.left is None and self.right is None:
				cntobj.count+=1
				return True
			elif self.left.cntUnivalTrees(cntobj) and self.right.cntUnivalTrees(cntobj):
				if self.left.data is None:
					if self.right.data == self.data:
						cntobj.count+=1
						return True
				if self.right.data is None:
					if self.left.data == self.data:
						cntobj.count+=1
						return True

				if self.left.data is not None and self.right.data is not None:
					if self.left.data == self.right.data and self.left.data == self.data:
						cntobj.count+=1
						return True
				return False

		else:
			return True
		

root = Node(0)
root.left = Node(1)
root.right = Node(0)
root.right.left = Node(1)
root.right.right = Node(0)
root.right.left.right = Node(1)
root.right.left.left = Node(1)
# root.insert(3)
# root.PrintTree()
cntobj = Value()



root.cntUnivalTrees(cntobj)
print("unival trees", cntobj.count)

