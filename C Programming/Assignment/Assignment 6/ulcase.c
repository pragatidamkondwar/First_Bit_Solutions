#include<stdio.h>
void ulcase();//function decleration
void main()
{
 ulcase();//function call	
}
//main function end here
void ulcase()//function defination
{
	char ch='a';
	if(ch>='a'|| ch<='z')
	{
		printf("uppercase letter");
	}
	else
	{
		printf("lowercase letter");
	}
}