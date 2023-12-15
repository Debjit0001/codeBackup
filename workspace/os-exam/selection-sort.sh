#!/bin/bash

echo "enter the elements of array: (space-separated)"
read -a arr

min=0
len=${#arr[@]}
temp=0

for((i=0; i < len-1; i++));
do
	for((j=i+1; j < len; j++)); do
		if [ ${arr[j]} -lt ${arr[min]} ]; then
			min=$j
		fi
	done

	temp=${arr[i]}
	arr[i]=${arr[min]}
	arr[min]=$temp
done

echo "sorted array: ${arr[@]}"
