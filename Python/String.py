#Strings are immutable
name ="Debjit"
friend = "Prosoon"

# print(name[0])
sentence = '''Hey my name is Debjit,
Prosoon is my friend'''
# print(sentence)

# for char in sentence:
#   print(char)
    
names = "Harry, Subham"
'''by default, the starting index is 0 and ending is len(string)
   Includes the start but doesn't include the end'''
# print(names[0:5]) 
# print(names[:5])
# print(names[7:])
# print(names[:])

fruit = "Mango"
# print("Mango is a ", len(fruit), "Letter word")

# print(fruit[:-2]) #same as fruit([0: len(fruit)-2])

a = "Harry"
# print(a[-4:-2])




'''String methods notes: https://replit.com/@Debjit01/13-Day13-String-Methods#main.py'''

print(a.upper())
print(a.lower())
'''These methods can't change the actual string object, they create a new string object and return that'''

b = "Hi!!!!"
print(b.rstrip("!")) #removes the trailing character given as input

print(b.replace("i", "ey")) #changes all occurences

c = "hi my name is Debjit"
print(c.split(" ")) #splits the string object into multiple lists based on the given separator
print(c.capitalize()) #converts the first character to uppercase and then checks if any of the rest character(s) is in uppercase, if that's the case then it converts them into lowercase

str = "introduction to programming in python"
print(str.center(50))
print(len(str), len(str.center(50)))

print(str.count('t')) #counts the occurence of given character/set of characters in the string object

print(str.endswith("on"))
print(str.startswith("to", 13, 51))
print(str.endswith("to", 2, 15))

print(str.find("tion")) #returns the first occurance
print(str.find("my")) #if given character(s) not found, returns -1

print(str.index("in")) #it's the same as find() but here it throws an error if substring isn't found

#isalnum() checks if all the characters in the string range between: a-z, A-Z, 0-9  ; if even one of them is not, then returns false
#isalpha() checks if all the character in the string range between: a-z, A-Z  
print(str.isalnum()) # returns false as there's " " blankspace is present in the given string

#islower() checks if all characters are lower case
#isupper() checks if all characters are upper case

#isprintable() checks if all characters are printable or not.. for example '\n' is not printable
#isspace() checks if the string object contains white spaces or not

print(str.title()) #converts all the first letters of the words present in the given string object into capital letters
#istitle() checks if all the first letters are in uppercase or not

print(str.swapcase()) #self explanetory