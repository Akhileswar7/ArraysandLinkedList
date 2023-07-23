arr = list(map(int,input("\nEnter the numbers : ").strip().split()))
for i in range(1,arr[-1]):
    if i not in arr:
        print(i)