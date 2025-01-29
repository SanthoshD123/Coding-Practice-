l1 = [[1, 2, 'str'], [7, 3, 'hi']]

num_list = []  
str_list = []

for sublist in l1:
    for item in sublist:
        if type(item) == int or type(item) == float:
            num_list.append(item)
        elif type(item) == str:
            str_list.append(item)

print("Numbers:", num_list)
print("Strings:", str_list)
