import pyautogui
import time
time.sleep(2)
count = 0
while count<=100:
    pyautogui.typewrite("Hey :)")
    pyautogui.press("enter")
    count+=1
    
''' #Google module in python
from googlesearch import search

query="Madonna"

for url in search(query):
    print(url)
    '''