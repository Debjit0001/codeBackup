#!/bin/bash

converter() {
	n=$1
	base=$2

	rem=0
	ans=""
	while [ $n -ne 0 ]; do
		rem=$((n%base))
		ans="$rem$ans"
		n=$((n/base))
	done

	echo $ans
}

echo -n "enter decimal value: "
read dec

b=8
octal=$(converter $dec $b)
echo "ocatal: $octal"

b=2
binary=$(converter $dec $b)
echo "binary: $binary"
