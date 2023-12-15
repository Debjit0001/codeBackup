#!/bin/bash

echo -n "Enter a number: "
read num

dig=0
temp=num
while [ $temp != 0 ]; do
	((dig++))
	temp=$((temp / 10))
done

pow() {
	base=$1
	expo=$2

	ans=1
	while [ $expo -gt 0 ]; do
		ans=$((ans * base))
		((expo--))
	echo $ans
}


