#include<stdio.h>
void add();//function decleration 
void main()
{
	add();//function call
}
void add()//function defination
{
	int a = 10 , b = 25 , c;
 	c = a + b;
 	printf("Add two numbers : %d",c);
 }