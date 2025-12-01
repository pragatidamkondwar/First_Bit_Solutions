#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	int count=0;
	printf("enter the string");
	scanf("%s",str);
	for(int i=0;str[i]!='\0';i++)
	{
		char ch=(str[i]);
		if(ch=='a' ||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
		{
			count++;
		}
	}
	printf("%d",count);
}