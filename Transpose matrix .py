l1 = [[1,2,3,4],[1,2,3,4],[1,2,3,4]]

l2 = []

for i in range(len(l1)+1):
    s = []
    for j in range(len(l1)):
        s.append(l1[j][i])
    l2.append(s)

print(l2)
