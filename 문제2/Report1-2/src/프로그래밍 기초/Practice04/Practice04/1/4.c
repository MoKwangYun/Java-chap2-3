#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

int main(void) {

	int num1;
	int num2;
	int num3;

	printf("3���� ���ڸ� ������� �Է��Ͻÿ�: ");
	scanf("%d, %d, %d", &num1, &num2, &num3);
	printf("%d + %d * %d = %d", num1, num2, num3, (num2 * num3) + num1);
	
	return 0;

	// 2017112823 ����
}