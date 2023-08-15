vote = int(input("Cast your vote: "))

#here the usage of break is not necessary, only code under matched case will run
match vote:
    case 1:
        print("You voted for BJP")
    case 2:
        print("You voted for Congress")
    case 3:
        print("You voted for TMC")
    case _: #default 
        print("You voted for NOTA")
        
#we can integrate if-else statements into the match case statement
x = int(input("\nEnter the value of x: "))
# x is the variable to match
match x:
    # if x is 0
    case 0:
        print("x is zero")
    # case with if-condition
    case 4:
        print("case is 4")

    case _ if x!=90:
        print(x, "is not 90")
    case _ if x!=80:
        print(x, "is not 80")
    case _:
        print(x)