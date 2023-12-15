#!/bin/bash

echo "enter the elements of array: (space-separated)"
read -a arr

len=${#arr[@]}
temp=0

for((i=0; i < len; i++));
do
	for((j=0; j < $((len-i-1)); j++));
	do
		k=$((j+1))
		if [ ${arr[j]} -gt ${arr[k]} ]; then
			temp=${arr[j]}
                	arr[j]=${arr[k]}
                	arr[k]=$temp
		fi
	done
done

echo "sorted array: ${arr[@]}"
