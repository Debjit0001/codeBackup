#!/bin/bash

echo enter size: 
read n

arr=()

for((i=0; i < $n; i++)); do
	read elem
	arr[$i]=$elem
done

echo ${arr[@]}
