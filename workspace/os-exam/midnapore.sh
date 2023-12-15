#!/bin/bash

str="Midnapore"
len=${#str}

for((i=0; i < len; i++)); do
	for((j=0; j <= $i; j++)); do
		echo -n ${str:$j:1}
		sleep 0.3
	done
	echo
done
