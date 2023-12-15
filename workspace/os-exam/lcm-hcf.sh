#!/bin/bash

calculate_hcf() {
    local num1=$1
    local num2=$2

	ans=1
	for((i=1; i <= $num1 && i <= $num2; i++)); do
		if [ $((num1 % i)) -eq 0 ] && [ $((num2 % i)) -eq 0 ]; then
			ans=$i
		fi
	done

	echo $ans
}

calculate_lcm() {
    local num1=$1
    local num2=$2
    local hcf=$(calculate_hcf $num1 $num2)

    local lcm=$((num1 * num2 / hcf))

    echo $lcm
}

read -p "Enter first number: " num1
read -p "Enter second number: " num2

hcf_result=$(calculate_hcf $num1 $num2)
echo "HCF of $num1 and $num2 is: $hcf_result"

lcm_result=$(calculate_lcm $num1 $num2)
echo "LCM of $num1 and $num2 is: $lcm_result"
