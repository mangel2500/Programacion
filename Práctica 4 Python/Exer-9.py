print "Introduce el alto"
alto= input()
print "introduce el ancho"
ancho= input()
for a in range(alto):
        if a==0 or a==alto-1:
                for b in range(ancho-1):
                        print "*",
        else:
                for c in range(ancho-1):
                        if c==0 or c==ancho-1:
                                print"*",
                        else:
                                print" ",
        print "*","\n",

