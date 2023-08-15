import matplotlib.pyplot as plt
import hashlib

# plt.title("First Plot")
x =[10, 20, 30, 40]
y =[20, 40, 60, 80]
plt.plot(x, y , "b^-", label="[10]: |A|=10", markerfacecolor='none', ms=8, markeredgecolor='blue') #"x-" and "x" creats lines, "xo" creates dots and "x--" creates dotted lines


plt.axis([0,100,0,200])
plt.xlabel("Embedding capacity(byte)")
plt.ylabel("Number of transactions")

plt.legend()

plt.show()