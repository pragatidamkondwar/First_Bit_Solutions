#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	int i;
	printf("Enter a string");
	scanf("%s",str);
	int len=strlen(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]=='a')
		{
			str[i]='$';
		}		
	}
	printf("%s",str);
	}                                                                                                                                                           

                                                                                                                                                                                                                                                                                                                