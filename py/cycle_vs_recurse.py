import time

def fact_cycle(n):
    res=1
    while n>1:
       res=res*n
       n=n-1
    return res

def fact_cyclefor(n):
    res=1
    for i in range(2, n+1):
       res=res*i
    return res

def fact_rec(n):
    if n==1:
        return 1
    else:
        return n*fact_rec(n-1)
rcount=1000000
print (fact_cycle(20))
print (fact_cyclefor(20))
print (fact_rec(20))
start=time.time()
for i in range(0,rcount):
    res=fact_cycle(20)
endtime=time.time()
print("While factorial =",endtime-start)
start=time.time()
for i in range(0,rcount):
    res=fact_cyclefor(20)
endtime=time.time()
print("For factorial =",endtime-start)
start=time.time()
for i in range(0,rcount):
    res=fact_rec(20)
endtime=time.time()
print("Recurse factorial =",endtime-start)


