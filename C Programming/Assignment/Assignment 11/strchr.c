#include<stdio.h>
#include<string.h>
int mystrchr(char* s1 , char s2);
void main()
{
	char s1[50];
	char s2;
	printf("enter the string");
	scanf("%s",s1);
	
	printf("enter the character");
	scanf("%c",&s2);
	
	if (mystrchr(s1 , s2))
	printf("character found");
	else
	printf(" character not found");
}
int mystrchr(char* s1 , char s2)
{
	int i=0;
	while(s1[i]!='\0')
	{
		if(s1[i]==s2)
			return 1;
		i++;	
	}
	return 0;
}