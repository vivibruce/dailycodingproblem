'''
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3
'''

inp_lst = list(map(int,input().split()))


#segregating positive and negative values bcoz we need only positive integers
def segrigate_pos_neg():
	j=0
	for i in range(len(inp_lst)):
		if inp_lst[i]<=0:
			inp_lst[j], inp_lst[i] = inp_lst[i], inp_lst[j]
			j+=1
	return j

#finding the least postive integer 
def findleastpositive(inp_lst, n):
	print(inp_lst)
	for i in range(len(inp_lst)):
		if abs(inp_lst[i])-1<len(inp_lst) and inp_lst[abs(inp_lst[i])-1]>0:
			inp_lst[abs(inp_lst[i])-1] = -inp_lst[abs(inp_lst[i])-1]
	p=0
	for p in range(len(inp_lst)):
		if inp_lst[p]>0:
			return p+1
	return p+1
shift = segrigate_pos_neg()
print(findleastpositive(inp_lst[shift:], len(inp_lst)-shift ))

