import pyautogui
import time
count = 0
while count<=300:
    pyautogui.keyDown("ctrl")
    pyautogui.press("v")
    pyautogui.keyUp("ctrl")
    time.sleep(2)
    pyautogui.press("enter")
    count+=1