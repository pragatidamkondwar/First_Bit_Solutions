#include<stdio.h>
void evenodd(int*);
void main()
{
	int no;
	printf("Enter the number");
	scanf("%d",&no);
	evenodd(&no);//call
}
// main end here
 void evenodd(int *no)//defination
{
	if(*no%2==0)
		printf("no is even");
	else
		printf("no is odd");	
}