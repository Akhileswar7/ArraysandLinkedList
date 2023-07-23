arr = list(map(int,input("\nEnter the numbers : ").strip().split()))
li=list(set(arr))
c=0
for i in li:
    if arr.count(i)%2!=0:
        c+=1
print(c)