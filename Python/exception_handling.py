try:
    a = int(input("Enter the number: "))
    print(f"Multiplication table of {a} is :")
    
    for i in range(1, 11):
        print(f"{a} X {i} = {a*i}")

except:
    print("invalid input")
    
    
# handling specific errors:
try:
    n = int(input("Enter an index: "))
    a = [1, 2, 3]
    print(a[n])
    
except ValueError:
    print("Value error")
except IndexError:
    print("Index error")