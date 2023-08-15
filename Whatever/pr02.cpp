#include<stdio.h>

int iter_gcd(int a, int b) {
	int min = (a < b) ? a : b;
	if(a % min == 0 && b % min == 0)
		return min;
		
	for(int i = min/2; i > 1; i--) {
		if(a % i == 0 || b % i == 0)
			return i;
	}

    return 1;
}

int main() {
	
	int a, b;
	printf("Enter two numbers to calculate GCD: \n");
	scanf("%d%d", a, b);
	
	printf("GCD of %d and %d is: %d", a, b, iter_gcd(a, b));
		
	return 0;
}