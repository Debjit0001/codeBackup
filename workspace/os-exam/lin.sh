#!/bin/bash

echo "enter the elements of the array: (space-separated): "
read -a arr

echo -n "enter element to search: "
read n

idx=-1

for((i=0; i < ${#arr[@]}; i++)); do
	if [ ${arr[i]} -eq $n ]; then
		idx=$i
		break;
	fi
done

if [ $idx -ne -1 ]; then
	echo "target element found at index: $idx"
else
	echo "element not found"
fi
