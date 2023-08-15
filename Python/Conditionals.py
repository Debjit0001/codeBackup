a = int(input("Enter your age: "))

# giving spaces to put some code under any block is called indentation
if(a > 18):
    print("You can drive")
else:
    print("You cannot drive")
    
if a>0:
    print("Age is positive")
    if(a <= 10):
        print("age is between 0-10")
    elif(a > 10 and a <= 20):
        print("age is between 10-20")
    else:
        print("age is greater than 20")
elif a == 0:
    print("Age is Zero")
else:
    print("Age is negative")