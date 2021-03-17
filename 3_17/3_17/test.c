#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
#define EXCHANGE(n) (((n&(0x55555555))<<1)|((n&(0xAAAAAAAA))>>1))
#define OFSETOF(endaddress,iniaddress) ((char*)endaddress-(char*)iniaddress)
//typedef struct stu
//{
//	int a;
//	char c;
//	int b;
//}stu;
//int main()
//{
//	stu p;
//	printf("%d",OFSETOF(&p.b,&p));
//}
int main()
{
	printf("%d", EXCHANGE(6));
	return 0;
}