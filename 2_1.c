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
//	printf("n的值为：%d\n", n);
//	printf("*pFloat的值为：%f\n", *pFloat);
//	*pFloat = 9.0;
//	printf("num的值为：%d\n", n);
//	printf("*pFloat的值为：%f\n", *pFloat); 
//	return 0;
//}
//int main()
//{
//	int a = 9;		//原码：00000000000000000000000000001001
//					//反码：00000000000000000000000000001001
//					//补码：0000 0000 0000 0000 0000 0000 0000 1001
//					//:补码的十六进制：0x00000009
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//
//}
//int main()
//{
//	int murder[4] = { 0 }; //默认4个人都不是凶手
//
//	int i;
//	for (i = 0; i < 4; i++) //遍历假设四个人中的某个人是凶手
//	{
//		murder[i] = 1; //假设某个人是凶手
//		if ((murder[0] != 1) +
//			(murder[2] == 1) +
//			(murder[3] == 1) +
//			(murder[3] != 1) == 3)
//		{
//			break; //满足就代表就是你了！
//		}
//		murder[i] = 0; //不满足还他清白
//	}
//
//	putchar('A' + i); //打印凶手的编号。我们的编号是0 1 2 3，加上'A'后变成A B C D。
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