# even if the error is not handled, the finally block always executes
try:
    a = int(input("Enter a number: "))
    
finally:
    print("Goodbye")
    
# here, although the function returns, still the finally clause executes
def func1():
  try:
    l = [1, 5, 6, 7]
    i = int(input("Enter the index: "))
    print(l[i])
    return 1
  except:
    print("Some error occurred")
    return 0

  finally:
    print("I am always executed")
  # print("I am always executed")


x = func1()
print(x)