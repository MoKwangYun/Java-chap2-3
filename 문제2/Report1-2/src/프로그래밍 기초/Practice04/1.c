#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MET(x) ((x) * 3.305785)

int main(void) {
	int x;
	printf("����� �Է��ϼ���: ");
	scanf("%d", &x);
	printf("%d���� %f ���������Դϴ�.\n\n", x, MET(x));


	

	return 0;
	//2017112823 ����
}