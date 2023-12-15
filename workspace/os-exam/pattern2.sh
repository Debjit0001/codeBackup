#!/bin/bash

echo -n "enter number of rows: "
read n

for((i=1; i <= $n; i++))
do
	for((j=$i; j >= 1; j--)); do
		echo -n "$j "
	done
	for((k=2; k <= $i; k++)); do
		echo -n "$k "
	done

	echo
done
