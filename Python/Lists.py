# lists are mutable ordered collection of data items
# a single list can contain multiple datatypes

marks = [92, 72, 89]
print(marks)
print(type(marks))
print(marks[0]) # follows 0th indexing
print(marks[0:-1]) # has slicing
print(marks[0::2]) # here the third argument is jump index (kinda like i+=2 in a for loop)
print(marks[-1]) # also implements negative indexing.. -i => len(list)-i

# finding any element in list: print(affarmative) if targetElement else print(negative)
if 72 in marks:
    print("True")
else:  
    print("False")
    
lst = [i for i in range(4)]
print(lst)

#printing even numbers in a given range:
m = 10
n = 20
lst = [i for i in range(m,n) if i%2 == 0]
print("All even numbers in given range are:",lst)


# //List Methods\\
print("\n\nList Methods\n")
    
list = [12, 5, 1, 2, 7, 0, 3, 4]
print(list)
list.append(7)
print(list)
list.sort()
print(list)
list.sort(reverse=True)
print(list)
print(list.count(7)) #returns the number of occurences of a value

m = list
m[0] = -1
print(list) #as 'm' is a referecen variable pointing toward the same list object, any change made via m will also end up in as a change in 'list'.. but if we wanna create another list with same values, use copy()
m = list.copy()
m[0] = 0
print(list)

n = [12, 41, 51]
m.extend(n) #here m is getting changed
print(m)
l = list + n