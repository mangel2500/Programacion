print 'Dame un nombre: '
nom = raw_input()


lista = []
lista1 = []

while nom!="":
    lista.append(nom)
    print('Dame un telefono: ')
    telef=int(input())
    lista.append(telef)
    lista1.append(lista)
    print('Dame otro nombre: ')
    nom = raw_input()
    lista = []

print lista1
