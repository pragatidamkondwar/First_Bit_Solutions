#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	int i,  flag=0;
	printf("enter the string");
	scanf("%s",str);
	int len=strlen(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]!=str[len-i-1])
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		printf(" the string is pallindrome");
	} else {
		printf("the string is not pallindrome"); 
	}
	
}