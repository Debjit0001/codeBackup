# typles are basically immutable lists; we can neither add any element to it, nor change the existing ones

# tup = (1) # this will be interpreted as an integer object, not a tuple
tup = (1, ) # example of a single element tuple
tup = (1, 5, 3, 4)
print(tup.index(3)) # returns the first occurance of the given element; raises valueError if not found
# print(tup)

x = tup #here a new tuple is generated, unlike in the case of list

# tuples are immutable so we can't change them directly, to perform any changes: tuple > list > tuple
tup = list(tup)
tup.append(13)
tup.pop(1)
tup = tuple(tup)
print(tup, type(tup))