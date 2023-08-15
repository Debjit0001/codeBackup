a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

def sum(a, b):
    return a+b

print("Sum = ", sum(a,b))   

def geometricMean(a, b):
    ans = (a*b)/(a+b)
    print("Geometric mean = ", ans)
    
geometricMean(a,b)

def findGreater(a, b):
    return (a if a>b else b)

print("Greater = ", findGreater(a,b))

def findLesser(a, b):
    pass #it means function is just declared here, it can be defined elsewhere. Now as this function doesn't do anything, it returns 'None'

print(findLesser(a,b))