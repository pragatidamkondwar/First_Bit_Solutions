#include<stdio.h>
#include<string.h>
void main()
{
	char a[]= "hello world";
	char *res= strchr(a,'e');
	if(res!=NULL)
	{
		printf("the index %d",res-a);		
	}
	else
	{
		printf("Not found");
	}
}