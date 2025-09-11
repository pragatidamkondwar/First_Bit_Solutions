#include<stdio.h>
void main()
{
	int no, n,sum=0;
	printf("enter the starting range");
	scanf("%d",&no);
	
	printf("enter the ending range");
	scanf("%d",&n);
	
	for(int i=no;i<=n;i++)
{
	int prime=1;
	
	if(i<2)
	prime=0;
	
	for(int j=2;j*j<=i;j++)
	{
		if(i%j==0)
		{
			prime=0;
			break;
		}
	}
	 if(prime)
	 {
	 	sum=sum+i;
	 }
}
printf("start=%d end=%d and sum=%d ",no,n,sum);
}