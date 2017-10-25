print 'Dame un altura'
al=input()
for a in range(1,al):
    for b in range(a):
        print("*"),
    print''
for a in range(al,0,-1):
    for b in range(a):
        print("*"),
    print''

