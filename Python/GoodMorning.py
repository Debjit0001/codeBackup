import time
from time import strftime, gmtime

print(strftime("%a, %d %b %Y %H:%M:%S +0000", gmtime()))

currTime = int(time.strftime("%H"))

if(currTime >= 6 and currTime <= 9):
    print("Good Morning :)")
elif(currTime >= 17 and currTime <= 22):
    print("Good Evening :)")