#define _CRT_SECURE_NO_WARNINGS   1
#include <stdio.h>
int main()
{

}
//#include <stdio.h>
//int main()
//{
//	int n = 9;
//	float*pFloat = (float*)&n;
//	printf("n��ֵΪ��%d\n", n);
//	printf("*pFloat��ֵΪ��%f\n", *pFloat);
//	*pFloat = 9.0;
//	printf("num��ֵΪ��%d\n", n);
//	printf("*pFloat��ֵΪ��%f\n", *pFloat); 
//	return 0;
//}
//int main()
//{
//	int a = 9;		//ԭ�룺00000000000000000000000000001001
//					//���룺00000000000000000000000000001001
//					//���룺0000 0000 0000 0000 0000 0000 0000 1001
//					//:�����ʮ�����ƣ�0x00000009
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//
//}
//int main()
//{
//	int murder[4] = { 0 }; //Ĭ��4���˶���������
//
//	int i;
//	for (i = 0; i < 4; i++) //���������ĸ����е�ĳ����������
//	{
//		murder[i] = 1; //����ĳ����������
//		if ((murder[0] != 1) +
//			(murder[2] == 1) +
//			(murder[3] == 1) +
//			(murder[3] != 1) == 3)
//		{
//			break; //����ʹ���������ˣ�
//		}
//		murder[i] = 0; //�����㻹�����
//	}
//
//	putchar('A' + i); //��ӡ���ֵı�š����ǵı����0 1 2 3������'A'����A B C D��
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int arr[4] = {0};
//	int i = 0;
//	for (i = 0; i < 4; i++)
//	{
//		arr[i] = 1;
//		if ((arr[0] != 1) +
//			(arr[2] == 1) +
//			(arr[3] == 1) +
//			(arr[3] != 1) == 3)
//		{
//			break;
//		}
//		arr[i] = 0;
//	}
//	putchar('A' + i);
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int arr[10][10] = { { 1 }, {1,1} };
//	int i = 0; 
//	int j = 0;
//	for (i = 0; i < 10; i++)
//	{
//		for (j = 0; j <= i; j++)
//		{
//			arr[i][j] = 1;
//		}
//	}
//	for (i = 0; i < 10; i++)
//	{
//		for (j = 0; j <= i; j++)
//		{
//			if ((0 == j) || (i == j)||(0==i)||(1==i))
//			{
//				printf("%d ",arr[i][j]);
//			}
//			else
//			{
//				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//				printf("%d ", arr[i][j]);
//			}
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	char p = "abdasd";
//		printf("%s ",p);
//}