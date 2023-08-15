''' Dictionaries are ordered collection of data items. They store multiple items in a single variable. 
    Dictionary items are key-value pairs that are separated by commas and enclosed within curly-braces{}'''
    
    
dict = {
    "harry": "human being",
    "spoon": "object"
}

# printing dictionary:

print(dict) # prints the whole dictionary in an ordered way

# now there are two ways to get the values of a certain key:
print(dict["harry"]) # if the key is absent in the dictionary, throws error
print(dict.get("debjit")) # gives "None"

# two ways to get the keys in a dictionary:
print(dict.keys())
for key in dict.keys():
    print(key, end=" ")
print()

# to get the values of keys, there are also two ways:
print(dict.values())
for key in dict.keys():
    print(f"{key} -> {dict[key]}")