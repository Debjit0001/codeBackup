# Doc strings are used to document the functions in a python program, they're different from comments
# we can use __doc__ attribute to access the docstring
# its written just after the definition of a functionl, with triple single quotes


def square(n):
    '''This function takes an input and returns the square of it'''
    return n**2

print(square(5))
print(square.__doc__)

