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
		printf("ͨѶ¼�������޷����\n");
	}
	else
	{
		printf("����:");
		scanf("%s", ps->s[ps->size].name);
		printf("����:");
		scanf("%d", &ps->s[ps->size].age);
		printf("�Ա�:");
		scanf("%s", ps->s[ps->size].sex);
		printf("�绰:");
		scanf("%s", ps->s[ps->size].tel);
		ps->size++;
	}
	system("cls");
}
void ShowBook(struct Peo* ps)
{
	if (ps->size == 0)
	{
		printf("ͨѶ¼Ϊ��\n");
	}
	int i = 0;
	printf("\t����\t����\t�Ա�\t�绰\n");
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
	printf("��������Ҫɾ��������:");
	scanf("%s",arr);
	ret = Seck(ps,arr);
	if (ret == -1)
	{
		printf("û���ҵ���Ҫɾ���Ķ���\n");
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
	printf("��������Ҫ���ҵ�����:");
	scanf("%s",arr);
	ret = Seck(ps, arr);
	if (-1 == ret)
	{
		printf("�������ҵ���ϵ�˲���ͨѶ¼��\n");
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
	printf("��������Ҫ�޸ĵ��ˣ�");
	scanf("%s",arr);
	ret = Seck(ps, arr);
	if (ret == -1)
	{
		printf("����Ҫ�޸ĵ�����Ϣ������\n");
	}
	else
	{
		printf("����:");
		scanf("%s", ps->s[ret].name);
		printf("����:");
		scanf("%d", &ps->s[ret].age);
		printf("�Ա�:");
		scanf("%s", ps->s[ret].sex);
		printf("�绰:");
		scanf("%s", ps->s[ret].tel);
	}
	system("cls");
}