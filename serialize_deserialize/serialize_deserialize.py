'''
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
'''
class Node:
	def __init__(self, data, left = None, right = None):
		self.data = data
		self.left = left
		self.right = right
	def serialiaze(self):
		if self:
			l=[]
			l.append(self.data)
			if self.left:
				l.append(self.left.serialiaze())

			else:
				l.append(-1)
			if self.right:
				l.append(self.right.serialiaze())
			else:
				l.append(-1)
			return l
		else:
			l.append(-1)
		return l
	

def deserialize(lst):
	if lst:
		node = Node(lst[0])
		if type(lst[1]) is list:
			node.left = deserialize(lst[1])
		else:
			node.left = None
		if type(lst[2]) is list:
			node.right = deserialize(lst[2])
		else:
			node.right = None
	return node
def count_nodes(node):
	return count_nodes(node.left) + count_nodes(node.right) + 1 if node else 0
	

node = Node('root', Node('left', Node('left.left')), Node('right'))
print(deserialize(node.serialiaze()).left.left.data == 'left.left')
print(count_nodes(node))

#  [1, [2, -1, -1], [3, [4, -1, -1], -1]]