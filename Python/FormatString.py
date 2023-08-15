str = "My name is {} and I am from {}"
# print(str.format("Debjit", "India"))

str = "My name is {1} and I am from {0}"
name = "Debjit"
country = "India"
# print(str.format(country, name))  #this is really inefficient and confusing

str = f"My name is {name} and I am from {country}"
print(str)

txt = "The price of this phone is only {price: .2f}$"
print(txt.format(price = 349.09999))

price = 99.99999
txt = "The price of this phown is ony {price:.2f}$"
print(txt)