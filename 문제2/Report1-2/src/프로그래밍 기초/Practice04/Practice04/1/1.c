#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MET(x) ((x) * 3.305785)

int main(void) {
	/*int x;
	printf("평수를 입력하세요: ");
	scanf("%d", &x);
	printf("%d평은 %f 제곱미터입니다.\n\n", x, MET(x));*/

	int a = 16;
	a << 2;
	a <<= 2;
	printf("%d", a<<2);


	

	return 0;
	//2017112823 모광윤
}