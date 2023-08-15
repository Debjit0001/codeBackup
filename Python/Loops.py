#only for and while loops are present in python


# iterating over a sequence of iterable objects

# name = "Debjit" 
# for i in name:
#     print(i, end = "")
#     if(i != 't'):
#         print(", ", end = "")
        
# print(end="\n\n")
        
        
# colours = ["Red", "Green", "Blue", "Yellow"]
# for color in colours:
#     for i in color:
#         print(i, end = " ")
#     print()
    
# print(end="\n\n")

#the loop goes till n-1

#the range function contains three parameters: start stop and step, similar to for loop in Java/C

# for i in range(5):
#     print(i, end=" ")
# print()
# for i in range(1, 10):
#     print(i, end=" ")
# print()
# for i in range(10, 0, -1):
#     print(i, end=" ")

# i = 0
# while i <= 10:
#     print(i, end = " ")
#     i += 1
    
# print()
# while i<50 :
#     i = int(input("Enter a number: "))
#     print(i)
    
# print("Done with the loop")     

# while loop with else: here after the loop condition becomes false, the else part is executed
i = 5
while i>0:
    print(i, end=" ")
    i -= 1
else:
    print("\nElse block executed")
    
    
# emulating do-while loop in python:
while True:
    i = int(input("\nEnter a number below 20: "))
    print(i)
    if(i>20):
        break
