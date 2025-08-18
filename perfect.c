#include<stdio.h>
void main()
{
	int no1 , no2 , sum=0 ,i;
	printf("enter the two number");
	scanf("%d %d",&no1,&no2);
	for(i=1;i<no2;i++)
	{
		sum=sum+i;
		if(sum>=no1&&sum<=no2)
		printf("\n sum=%d",sum);
	}
}