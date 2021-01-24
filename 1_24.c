#define _CRT_SECURE_NO_WARNINGS   1
void ExchangeArr(int arr1[], int arr2[])
{
	int temp = 0;
	int i = 0;
	for (i = 0; i < 9; i++)
	{
		temp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = temp;
	}
}
int main()
{
	int i = 0;
	int arr1[9] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int arr2[9] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	 
	for (i = 0; i < 9; i++)
	{
		printf("%d ",arr1[i]);
	}
	printf("\n");

	for (i = 0; i < 9; i++)
	{
		printf("%d ", arr2[i]);
	}
	printf("\n");

	ExchangeArr(arr1, arr2);

	for (i = 0; i < 9; i++)
	{
		printf("%d ", arr1[i]);
	}
	printf("\n");

	for (i = 0; i < 9; i++)
	{
		printf("%d ", arr2[i]);
	}
	printf("\n");
}
//void print(int arr[])
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",arr[i]);
//	}
//}
//void reverse(int arr[])
//{
//	int temp = 0;
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		if (i <= 10 - i)
//		{
//			temp = arr[i];
//			arr[i] = arr[9 - i];
//			arr[9 - i] = temp;
//		}
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//}
//
//void Init(int arr[])
//{
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		arr[i] = 0;
//	}
//}
//
//int main()
//{
//	int i = 0;
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	Init(arr);
//
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d",&arr[i]); 
//	}
//
//	print(arr);
//
//	printf("\n");
//
//	reverse(arr);
//}
//int main()
//{
//	int arr[10] = { 0 };
//	int i = 0;
//	int temp = 0;
//	int flag = 1;
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//
//	for (i = 0; i < 9; i++)
//	{
//		int j = 0;
//		for (j = 0; j < 9 - i; j++)
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//				flag = 0;
//			}
//		}
//		if (1 == flag)
//		{
//			break;
//		}
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ",arr[i]);
//	}
//}