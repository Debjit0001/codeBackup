#!/bin/bash

echo -n "enter a string: "
read str

rev=""
len=${#str}

for((i=len-1; i >= 0; i--)); do
	rev="$rev${str:$i:1}"
done

if [ $str == $rev ]; then
	echo "$str is palindrome"
else
	echo "$str is not palindrome"
fi
