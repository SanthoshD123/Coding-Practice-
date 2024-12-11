list1 = ['idly', 'dosa', 'puri', 'chappathi']
list2 = ['puri', 'chappathi', 'idly','dosa']

index1 = 10
index2 = 10

for i in range(len(list1)):
    indx = list2.index(list1[i])

    if i + indx < index1+index2:
        index1 = i
        index2 = indx
print(list1[index1], index2+index1)
