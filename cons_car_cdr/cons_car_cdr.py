def cons(a, b):
	def pair(f):
		return f(a, b)
	return pair


#car(cons(2, 3)) => 2
#cdr(cons(2, 3)) => 3

def car(f):
	def left(a, b):
		return a
	return f(left)	

def cdr(f):
	def right(a, b):
		return b
	return f(right)
print(car(cons(3, 4)))
print(cdr(cons(3, 4)))




