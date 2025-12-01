#include<stdio.h>
#include<string.h>
char* mystrcpy(char* ,char*);
void main()
{
	char s1[7]="pragati";
	char s2[7];
	char *res=mystrcpy(s2,s1);//call
	printf("%s",res);
}
char* mystrcpy(char* str2,char* str1)
{
	int i=0;
	while(str1[i]!='\0')
	{
		str2[i]=str1[i];
		i++;
	}
	str2[i]='\0';
	return str2;
}