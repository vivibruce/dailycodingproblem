'''
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17

'''


num_lst = list(map(int,input().split()))
target_sum = int(input())
flag=0
num_lst.sort()
p1=0
p2=len(num_lst)-1
while p1<p2:
	if num_lst[p1]+num_lst[p2]==target_sum:
		print("the pair is {}, {}".format(num_lst[p1], num_lst[p2]))
		flag+=1
		p1+=1
		p2-=1
	elif num_lst[p1]+num_lst[p2]<target_sum:
		p1+=1
	elif num_lst[p1]+num_lst[p2]>target_sum:
		p2-=1

if flag==0:
	print("not found any pair")