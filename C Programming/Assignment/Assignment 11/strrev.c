#include<stdio.h>
#include<string.h>
char* mystrrev(char*);
void main()
{
	char str[]="hello";
	printf("the original string\n");
   char* p=mystrrev(str);
	printf(" the reverse string %s",p);
}
char* mystrrv(char* str)
{
	int i,j;
	char temp;
	int len=strlen(str);
	while(i<j)
	{
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;
	}
	return str;
}
