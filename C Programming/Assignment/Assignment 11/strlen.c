#include<stdio.h>
#include<string.h>
int* mystrlen(char* str);
void main()
{
	char str[6]="hello";
	int* res=mystrlen(str);
	printf("%d",res);
	 
}// main end here
int* mystrlen(char* str1)
{
	int i=0;
	while(str1[i]!='\0')
	{
		i++;
	}
		return i;
}