print 'Mete una nota'
nota = float(input())
notas = []

while nota >= 0 and nota <= 10:
    nota = float(input('Dame tus notas: '))
    notas.append(nota) 
print notas     


