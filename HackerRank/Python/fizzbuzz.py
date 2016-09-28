def fizzbuzz():
	for i in range(1,101):
		s = ''
		s += 'fizz' if i % 3 == 0 else ''
		s += 'buzz' if i % 5 == 0 else ''
		s += str(i) if s == '' else ''
		print(s)

def fizzbuzz2():
	for i in range(1,101):
		s = 'fizz' if i % 3 == 0 else ''
		s = 'buzz' if i % 5 == 0 else ''
		s = 'fizzbuzz' if i % 5 == 0 else ''
		s = str(i) if s == '' else ''
		print(s)

def fizzbuzz1():
	print( '\n'.join( map( lambda x: 'fizzbuzz' if x%15 == 0 else ( 'fizz' if x%5==0 else ( 'buzz' if x%3==0 else str(x))), [ i for i in range(1,100) ] ) ) )

fizzbuzz1()
