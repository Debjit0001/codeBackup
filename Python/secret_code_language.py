# Write a python program to translate a message into secret code language. Use the rules below to translate normal English into secret code language

import random
import string

# Coding:
# if the word contains atleast 3 characters, remove the first letter and append it at the end
#   now append three random characters at the starting and the end
# else:
#   simply reverse the string

def code(str = ''):
    if(len(str) >= 3):
        return ''.join(random.choices(string.ascii_letters, k=3)) + str[1:] + str[0] + ''.join(random.choices(string.ascii_letters, k=3))
    else:
        ans = ''
        for letter in str:
            ans = letter + ans
        return ans        
    
def coding(str=''):
    words = str.split()
    s = ''
    for word in words:
        s += code(word) + " "
    return s

# Decoding:
# if the word contains less than 3 characters, reverse it
# else:
#   remove 3 random characters from start and end. Now remove the last letter and append it to the beginning

# Your program should ask whether you want to code or decode

def decode(str=''):
    if(len(str)<3):
        ans = ''
        for letters in str:
            ans = letters + ans
        return ans
    else:
        return str[len(str)-4] + str[3:-4]
    
def decoding(str=''):
    words = str.split()
    s =''
    for word in words:
        s += decode(word) + " "
    return s
    
    
    
str = input("Enter a string: ")
# a = coding(str)
# print("\ncoding:- " + a)
b = decoding(str)
print("\ndecoding:- " + b)