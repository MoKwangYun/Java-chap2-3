#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void) {
	
	int a;
	int b;
	int c;

	printf("[��� ��� ���α׷�]\n");

	printf("���� ������ �Է��Ͻÿ�: ");
	scanf("%d", &a);

	printf("���� ������ �Է��Ͻÿ�: ");
	scanf("%d", &b);

	printf("���� ������ �Է��Ͻÿ�: ");
	scanf("%d", &c);

	printf("�� ������ ��� ������ %f���Դϴ�.", (a + b + c) / 3.0);

	return 0;

	// 2017112823 ����
}