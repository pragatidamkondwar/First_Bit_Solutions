#include<stdio.h>
void character(char*);//decleration
void main()
{
	char ch;
	printf("Enter the character");
	scanf("%c",&ch);
	character(&ch);//call	
}// main end here
void character(char *ch)//defination
{
	if(*ch>='A'&& *ch<='Z')
		printf("it is uppercase letter");
	else
		printf("it is lowercase letter");
}