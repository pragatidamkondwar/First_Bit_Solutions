#include<stdio.h>
void vowel(char*);// decleration
void main()
{
	char ch;
	printf("enter the character");
	scanf("%c",&ch);
	vowel(&ch);//call
}// main end here
void vowel( char *ch)//defination
{
	if(*ch=='a'||*ch=='e'||*ch=='i'||*ch=='o'||*ch=='u')
		printf("it is a vowel");
	else
		printf("it is a consonant");	
}