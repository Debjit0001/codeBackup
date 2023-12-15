#!/bin/bash

echo -n "enter number to calculate factorial: "
read num

f=1
while [ $num -gt 1 ]; do
	f=$((f*num))
	echo -n "$num*"
	((num--))
done

echo "1 = $f"
