#define _CRT_SECURE_NO_WARNINGS   1
#include "Address_Book.h"
void InitBook(struct Peo* ps)
{
	memset(ps->s, 0, sizeof(ps->s));
	ps->size = 0;
}
int Seck(struct Peo*ps,char arr[MAX_NAME])
{
	int ret = 0;
	int i = 0;
	for (i = 0; i < ps->size; i++)
	{
		ret = strcmp(ps->s[i].name, arr);
		if (0 == ret)
		{
			return i;
		}
	}
	return -1;
}
void AddBook(struct Peo* ps)
{
	if (ps->size == MAX)
	{
		printf("通讯录已满，无法添加\n");
	}
	else
	{
		printf("姓名:");
		scanf("%s", ps->s[ps->size].name);
		printf("年龄:");
		scanf("%d", &ps->s[ps->size].age);
		printf("性别:");
		scanf("%s", ps->s[ps->size].sex);
		printf("电话:");
		scanf("%s", ps->s[ps->size].tel);
		ps->size++;
	}
	system("cls");
}
void ShowBook(struct Peo* ps)
{
	if (ps->size == 0)
	{
		printf("通讯录为空\n");
	}
	int i = 0;
	printf("\t姓名\t年龄\t性别\t电话\n");
	for (i = 0; i < ps->size; i++)
	{
		printf("\t%s\t%d\t%s\t%s\n", 
			ps->s[i].name,
			ps->s[i].age,
			ps->s[i].sex,
			ps->s[i].tel);
	}
}
void DelBook(struct Peo* ps)
{
	int ret = 0;
	char arr[MAX_NAME];
	printf("请输入你要删除的姓名:");
	scanf("%s",arr);
	ret = Seck(ps,arr);
	if (ret == -1)
	{
		printf("没有找到你要删除的对象\n");
	}
	else
	{
		int i = 0;
		for (i = ret; i < ps->size-1; i++)
		{
			ps->s[i] = ps->s[i + 1];
		}
		ps->size--;
	}
	system("cls");
}
void SeckBook(struct Peo* ps)
{
	int ret = 0;
	char arr[MAX_NAME] = {0};
	printf("请输入你要查找的姓名:");
	scanf("%s",arr);
	ret = Seck(ps, arr);
	if (-1 == ret)
	{
		printf("你所查找的联系人不在通讯录中\n");
	}
	else
	{
		printf("%s\t%d\t%s\t%s\n",
			ps->s[ret].name,
			ps->s[ret].age,
			ps->s[ret].sex,
			ps->s[ret].tel);
	}
	system("cls");
}
void ModiBook(struct Peo* ps)
{
	int ret = 0;
	char arr[MAX_NAME] = {0};
	printf("请输入你要修改的人：");
	scanf("%s",arr);
	ret = Seck(ps, arr);
	if (ret == -1)
	{
		printf("你所要修改的人信息不存在\n");
	}
	else
	{
		printf("姓名:");
		scanf("%s", ps->s[ret].name);
		printf("年龄:");
		scanf("%d", &ps->s[ret].age);
		printf("性别:");
		scanf("%s", ps->s[ret].sex);
		printf("电话:");
		scanf("%s", ps->s[ret].tel);
	}
	system("cls");
}