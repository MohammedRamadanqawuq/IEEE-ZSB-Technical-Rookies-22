import random
def Comp(rand,InPut):
    Hit=0
    Miss=0
    x=[]
    y=[]
    for i in range (3):
        if rand[i]==InPut[i]:
            Hit+=1
        else:
            x.append(rand[i])
            y.append(InPut[i])
    for i in range(len(x)):
        for j in range(len(x)):
            if x[i] == y[j]:
                Miss+=1
    return (Hit,Miss)
Hit=0
Miss=0
rand = int(random.random() * 1000)
u1 = rand % 10
t1 = int((rand / 10) % 10)
h1 = int(rand / 100) % 10
randlist = [u1, t1, h1]
while Hit != 3:
    InPut= int(input("Enter a 3-digit number : \n"))
    u= InPut % 10
    t=int((InPut/10)%10)
    h=int(InPut/100)%10
    InPutlist=[u,t,h]
    Hit,Miss= Comp(randlist,InPutlist)
    print(Hit,'Hit',Miss,'Miss')
print('Your guess is right')
