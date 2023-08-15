import matplotlib.pyplot as plt

plt.title("Plotting sequences")

x = []
y = []
for i in range(1, 100):
    x.append(i)
    y.append(i)
    # y.append((i**2 + 1)/i**2)

plt.plot(x, y , "--", markerfacecolor='none', ms=8, markeredgecolor='blue')

plt.axis([0,100,0,100])
plt.xlabel("n")
plt.ylabel("f(n) = n")

plt.legend()

plt.show()