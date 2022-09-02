import functools


from functools import reduce

lista=[1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1]

Lista_impares=filter(lambda x: x%2!=0, lista)
Lista_sum=reduce((lambda a, b: a + b), Lista_impares)
print(Lista_sum)