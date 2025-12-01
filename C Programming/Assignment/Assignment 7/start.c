#include<stdio.h>
void starting(int* ,int*);
void main()
{
	int start,end;
	printf("enter the start no");
	scanf("%d",&start);
	printf("enter the end no");
	scanf("%d",&end);
	starting(&start,&end);	
	
}//main end here
void starting(int *start, int *end)
{
	int sum=0;
	while(*start<=*end)
	{
		sum=sum+*start;
		
		(*start)++;
	}
	printf("sum=%d\n",sum);
}