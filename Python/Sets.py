# In mathematics, set is a collection of well defined elements
# in python, they're unordered collection of data items, encloed by {} and separated by ','
# ** Sets are unchangable and they DON'T CONTAIN DUPLICATE ITEMS    

s = {3, 5, 1}
# print(s)

s1 = {} #empty sets are interpreted as dictionary
# print(type(s1)) 
# so to create empty set, we do it like this: s2 = set()

info = {"Carla", 19, False, 9.3, 19}
# print(info) # it may print in different order for each time

# accessing elements in set:
# for value in info:
#     print(value, end=" ")
    
'''                 SET METHODS                 '''

cities = {"Tokyo", "Berlin", "Helsinki", "Rio"}
cities.add("Nairobi") # if we wanna add more than one items, we can use update()
cities.remove("Rio") # similar method -> discard(), it doesn't throw an error if we try to remove a non-existing item, but tring to do the same thing with remove() will generate an error
print(cities)

cities.pop() # removes the last element from the set, but as sets are unorderd, we can't say which one of the elements will get removed
print(cities)

# if we wanna delete a whole set use delete
del cities
# print(cities) # now this will generate error, as cities is undefined right now

setExample = {'hi', 'how', 'are', 'you'}
setExample.clear()
print(setExample)

set1 = {1, 3, 6}
set2 = {2, 3, 6, 7}

print(set1.union(set2))
# set1.update(set2) #the methods like union don't change the actual objects, so to perform changes, we use update()
# print(set1, set2)

print(set1.intersection(set2))
# set1.intersection_update(set2)
# print(set1)

#difference:
print(set1.difference(set2))
# set1.difference_update(set2)

# Symmetric difference: (AuB) - (A∩B)
print(set1.symmetric_difference(set2))
# set1.symmetric_difference_update(set2)

print(set1.isdisjoint(set2)) # checks if the items of the given set object are present in another set

print(set1.issuperset(set2)) # checks if the original set is the super set of the given parameter set
print(set1.issubset(set2)) # self explainatory

#finding any element in a set: 
item = 1
if item in set1:
    print("item found")
else:
    print("Item not found")