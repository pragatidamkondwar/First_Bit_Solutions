#include<stdio.h>
#include<string.h>
void main()
{
	char str[10],result[10];
	int i , j=0;
	printf("enter the string");
	scanf("%s",str);
	for(i=0;str[i]!='\0';i++)
	{
		if(i%2==0)
		{
			result[j]=str[i];
			j++;
		}
	}
	result[j]='\0';
	printf("%s",result);
}