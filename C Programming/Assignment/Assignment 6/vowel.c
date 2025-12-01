#include<stdio.h>
void vowel();//function decleration
void main()
{
vowel()/;//function call
}
//main function end here
void vowel();//function defination 
{

	char ch='a';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		printf("it is a vowel");
	}
	else
	{
		printf("it is a consonant");
	}
}