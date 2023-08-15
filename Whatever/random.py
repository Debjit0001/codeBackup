import random
string = "qwertyuioplkjhgfds azxcvbnm"
i = 1
list = ['h']
ans = 'hello world'
n = len(ans)

for i in range(n):
    list.join(random.choice(string))
    print(list)
    if(random.choice(string)) == ans[i]:
        i = i + 1