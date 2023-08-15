# used to raise custom errors in python
# similar to what "throw" does in java

# for example, if we wanna print all the prime numbers between m and n, m should be less than n
m = int(input("Enter lower bound: "))
n = int(input("Enter upper bound: "))

if(m>n or m < 0 or n < 0):
    raise ValueError(print("Enter a valid range!"))

def isPrime(n):
    c = 2
    while(c*c <= n):
        if(n%c == 0):
            return False
        c+=1
    return True

for i in range(m,n):
    if(isPrime(i)):
        print(i, end=" ")
        