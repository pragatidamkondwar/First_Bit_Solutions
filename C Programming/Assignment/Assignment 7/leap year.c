#include<stdio.h>
void leap(int*);//decleration
void main()
{
	int year;
	printf("enter the year");
	scanf("%d",&year);
	leap(&year);//call
}
// main end here
 void leap(int *year)//defination
 {
 	if(*year%4==0 && *year%100!=0)
		printf("it is a leap year");
	else
		printf("it is a not leap year");
 }