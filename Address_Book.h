#include <stdio.h>
#define MAX_NAME 20
#define MAX_SEX 20
#define MAX_TEL 20
#define MAX 1000
#include <string.h>
#include <stdlib.h>
struct h
{
	char name[MAX_NAME];
	int age;
	char sex[MAX_SEX];
	char tel[MAX_TEL];
};
struct Peo
{
	struct h s[MAX];
	int size;
};
enum S
{
	EXIT,
	ADD,
	DEL,
	SECK,
	MODI,
	SHOW
};
void AddBook(struct Peo* ps);
void InitBook(struct Peo* ps);
void ShowBook(struct Peo* ps);
void DelBook(struct Peo* ps);
void SeckBook(struct Peo* ps);
void ModiBook(struct Peo* ps);