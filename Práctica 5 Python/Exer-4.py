# -*- coding: cp1252 -*-
print 'Dame un numero'
n=raw_input()

print 'Dame un numero mayor que',n
n2=raw_input()

while n2 < n :
    print '', n2,'no es mayor que', n,',dame otro numero: '
    n2=raw_input()
    
print 'Los numero que has escrito són', n,'y', n2

