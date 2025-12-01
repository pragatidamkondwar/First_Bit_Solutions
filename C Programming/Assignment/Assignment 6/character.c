#include<stdio.h>
void character();//function decleration
void main()
{
	character();//function call
}
//main function end here
void character()//function defination
{
	char ch='A';
	if(ch>='a'|| ch<='z')
	{
		printf("uppercase letter");
	}
	else
	{
		printf("lowercase letter");
	}
}	
