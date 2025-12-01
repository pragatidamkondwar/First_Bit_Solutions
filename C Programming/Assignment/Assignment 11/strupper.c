#include<stdio.h>
#include<string.h>
char* mystrupper(char*);
void main()
{
	char str[]="hello";
char res = mystrupper(str);
    printf("%s",str);
}
//main end here
char* mystrupper(char* str)
{
	int i=0;
	while (str[i]!='\0'){
	if (str[i]>='a' && str[i]<='z'){
	  str[i]= str[i]-32;
    }
	i++;
 }
 return str;
}