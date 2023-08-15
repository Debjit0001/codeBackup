# There are 4 types of arguments in python: 
# 1. Default argument
# 2. Keyword argument
# 3. Required argument
# 4. Variable argument


# 1. Default argument: we can pass some default values to the parameters when defining the function, so if there are no arguments are passed while calling the function, those default values are used. 
def add(a=0, b=0):
    print("sum =", a+b)
    
add()
add(1)
add(2, 3)


# 2. Keyword arguments: here, we can provide arguments as key=value so while interpreting, the order doesn't matter, python will check the key values and assign them accordingly
def name(fname, mname="James", lname="Watson"):
    print(fname, mname, lname)
    
name("Harry")
name(mname="Chris", fname="Thomas")


# 3. Required arguments: in case we don't have default argument values or we don't pass key value pairs, its important to pass all the arguments in order
def name(fname, lname) :
    print("Hello,", fname, lname)
    
name("Peter", "Quill")
# if we call the function like name("Peter"), it'll throw an error as lname gets no value


# 4. Variable arguments: if we put *before the  argument, its now interpreted as a tuple and if we put ** before the argument, its now a dictionary
def avg(*nums):
    print(type(nums))
    sum = 0
    for i in nums:
        sum += i
    return sum/len(nums)
        
print("Average of the given arguments = ", avg(2,3,53,64))

def fullName(**name):
    print(type(name))
    print("Hellow,", name["fname"], name["mname"], name["lname"])
    
fullName(lname="Dua", fname="Santi", mname="Pada")