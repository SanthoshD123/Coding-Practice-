s1 = 'santhosh.damu78@gmail.com'

s = 0

for i in s1:
    if i != '@':
        s += 1
    else:
        break
print('username:', s1[:s:], ' domain: ',s1[s+1::] )
