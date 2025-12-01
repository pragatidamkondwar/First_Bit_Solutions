#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	char s;
	printf("enter the string\n");
	fgets(str, sizeof(str),stdin);	
	printf("enter the special symbol");
	scanf("%c",&s);
	
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]==' ')
		{
			str[i]=s;
		}
	}
	printf("%s",str);
}