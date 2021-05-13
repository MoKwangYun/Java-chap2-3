#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>


#define ONE(x) ((x) * (x) * (x) * 3)
#define TWO(x) ((x) * (x) * 7)
int main(void) {
	


	double b;
	printf("x의 값을 실수로 입력하시오: ");
	scanf("%lf", &b);
	double y1;
	y1 = ONE(b) - TWO(b) + 9;
	printf("다항식의 값은 %lf입니다.\n\n", y1);

	double a;
	printf("x의 값을 실수로 입력하시오: ");
	scanf("%lf", &a);
	double y2;
	y2 = (3 * pow(a, 3.0)) - (7 * pow(a, 2.0)) + 9;
	printf("다항식의 값은 %lf입니다.", y2);

	return 0;

	//2017112823 모광윤
}