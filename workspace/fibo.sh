#!/bin/bash

echo -n " enter the number: "
read n

echo "$n terms of fibonacci series are: "
a=0
b=1
echo -n "$a "
echo -n "$b "

for((i=2; i <= n; i++)); do
    c=$((a+b))
    echo -n "$c "
    a=$b
    b=$c
done