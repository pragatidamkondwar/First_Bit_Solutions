#include<stdio.h>
#include<string.h>
void main()
{
char s[]= "hello world";
char *res = strstr(s, " ");
if(res!=NULL)
{
	printf("found");
}
else
{
	printf("not found");
}
}