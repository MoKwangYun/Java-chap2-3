#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void) {
	
	int a;
	int b;
	int c;

	printf("[평균 계산 프로그램]\n");

	printf("국어 점수를 입력하시오: ");
	scanf("%d", &a);

	printf("수학 점수를 입력하시오: ");
	scanf("%d", &b);

	printf("영어 점수를 입력하시오: ");
	scanf("%d", &c);

	printf("세 과목의 평균 점수는 %f점입니다.", (a + b + c) / 3.0);

	return 0;

	// 2017112823 모광윤
}