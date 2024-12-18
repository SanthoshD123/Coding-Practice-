s1 = "1#321#3"
l1 = []
current = ""

for i in s1:
    if i != "#":
        current += i
    else:
        l1.append(current)
        current = ""

l1.append(i)
print(l1)

#remove delimiter 
#o/p : ["1","321","3"]
