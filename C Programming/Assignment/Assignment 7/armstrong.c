#include<stdio.h>
void armstrong(int*);//decleration
void main()
{
	int no;
	printf("enter the number");
	scanf("%d",&no);
	armstrong(&no);//call
}
// main end here
void armstrong(int *no)//defination
{
	int r, sum=0,temp;
		temp=*no;
		while(*no!=0)
		{
			r=*no%10;
			sum=sum+r*r*r;
			*no=*no/10;
		}
		if(sum==temp)
		{
			printf("%d no is armstrong",sum);
		}
		else
		{
			printf("%d no is not armstrong",sum);
		}
}