# the else part executes only after all iterations of the loop have been successfully executed
# if somehow the loop breaks in the middle, the else part doesn't get executed

for i in range(5):
    print(i)
else:
    print("Loop exited")
    
for i in range(3):
    if(i==0):
        break
    print(i)
else:
    print("else statement")
    
    
# same thing can be done with while loopr