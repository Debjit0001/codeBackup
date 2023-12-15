#!/bin/bash

sum_of_factors() {
	sum=0
	local num=$1

	for((i=1; i <= $((num / 2)); i++)); do
		if [ $((num % i)) -eq 0 ]; then
			sum=$((sum + i))
		fi
	done

	echo $sum
}

echo -n "enter number to check if it is perfect or not: " 
read num

if [ $(sum_of_factors $num) -eq $num ]; then
	echo "$num is a perfect number"
else
	echo "$num is not a perfect number"
fi
