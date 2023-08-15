# lets take performance reviews of employees of a company as a dictionary by mapping their individual IDs with rating out of 100
# performance review by two managers:
pr1 = {122: 45, 123: 89, 222: 69, 670: 69} 
pr2 = {222: 67, 566: 90}

# clear() method, as the name suggests, clears the dictionary and leaves just the curly-brackets {}
pr2.clear()
print(pr2)

# the pop() method removes the given key and the popitem() removes the last element
pr1.pop(122)
pr1.popitem()
print(pr1)

# the del key word simply deletes the given object, may it be the whole dictionary or any key-value pair:
del pr1[123]
print(pr1)

del pr1

# The update() method updates the value of the key provided to it if the item already exists in the dictionary, else it creates a new key-value pair.
info = {'name':'Karan', 'age':19, 'eligible':True}
print(info)
info.update({'age':20})
info.update({'DOB':2001})
print(info)