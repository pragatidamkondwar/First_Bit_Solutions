#include<stdio.h>
#include<string.h>
char* mystrcat(char*, char*);
void main()
{
    char str1[]="hello";
	char str2[]="world"; 
char*p=	mystrcat(str1,str2);//call
	printf("%s",p);
}
char* mystrcat(char* str1, char*str2)//def
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
