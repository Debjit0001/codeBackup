import random
import string
# a = input("Enter any value between 5 and 9: ")
# if(a == "quit"):
#     print("program exited")
# else:
#     a = int(a)
#     if(a<5 or a>9):
#         raise ValueError(print("Value should be between 5 and 9"))

a = str(random.choices(string.ascii_letters, k=3))
print(a[1])