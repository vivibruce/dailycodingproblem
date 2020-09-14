'''
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5
'''

inplst = list(map(int, input().split()))
included_sum, excluded_sum = inplst[0], 0
for i in range(1,len(inplst)):
	temp = max(included_sum, excluded_sum)

	included_sum = excluded_sum + inplst[i]
	excluded_sum = temp

print(max(included_sum, excluded_sum))
