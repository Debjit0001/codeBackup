# Ordered collection of KEY-VALUE pairs
rollNo = {
    "Subhasree": 1,
    "Monica": 2,
    "Subhadip": 3
}

print(rollNo)
# print(rollNo.items()) # prints the paired items in a nice separated manner

# two ways to get valus of keys:
print(rollNo["Subhasree"])  # raises an error if key is absent
print(rollNo.get("Atul"))  # if key is absent, returns None

# printing keys:
# print(rollNo.keys())
# another method:
# for key in rollNo.keys():
# print(key, end=" ")

# values can be accessed in similar way:
# print(rollNo.values())

# printing dict prettily:
for key in rollNo.keys():
    print(f"{key} -> {rollNo[key]}")
