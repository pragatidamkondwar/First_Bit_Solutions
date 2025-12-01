#include<stdio.h>
void vote(int*);//decleration
void main()
{
		int age;
		printf("enter the age");
		scanf("%d",&age);
		vote(&age);//call
}
// main end here
 void vote(int *age)//defination
{
	if(*age>=18)
		printf("you are eligible for voting");
	else
		printf("you are not eligible for voting");
}