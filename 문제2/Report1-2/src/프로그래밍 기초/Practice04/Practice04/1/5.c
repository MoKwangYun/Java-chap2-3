#define _CRT_SECURE_NO_WARNINGS

#define SQ2(x) ((x) * (x))
#define SQ4(x) SQ2(x) * SQ2(x)

#include<stdio.h>

int main(void) {

	double x;
	printf("x�� ���� �Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &x);
	printf("x�� ������ %.1lf�Դϴ�.\n", SQ2(x));
	printf("x�� �������� %.1lf�Դϴ�.", SQ4(x));

	return 0;

	// 2017112823 ����
}