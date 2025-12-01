#include<stdio.h>
#include<string.h>
char* mystrlwr(char*);
void main()
{
	char str[]="HELLO";
char res = mystrlwr(str);
    printf("%s",str);
}
//main end here
char* mystrlwr(char* str)
{
	int i=0;
	while (str[i]!='\0'){
	if (str[i]>='A' && str[i]<='Z'){
	  str[i]= str[i]+32;
    }
	i++;
 }
 return str;
}