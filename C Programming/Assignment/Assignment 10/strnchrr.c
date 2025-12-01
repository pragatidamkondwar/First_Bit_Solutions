#include<stdio.h>
#include<string.h>
void main()
{
	char a[]= "hello world";
	char *res= strrchr(a,'d');
	if(res!=NULL)
	{
		printf("the index %d",res-a);		
	}
	else
	{
		printf("Not found");
	}
}