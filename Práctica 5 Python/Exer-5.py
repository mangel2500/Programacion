# -*- coding: cp1252 -*-
print 'Dame un numero'
n=raw_input()

print 'Dame un numero mayor que',n
n2=raw_input()

numeros = [n]

while n2 > n :
    numeros.append(n2)
    print 'Dame un numero mayor que', n2,': '
    n2=raw_input()
    
print numeros
