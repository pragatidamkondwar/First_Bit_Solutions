#include<stdio.h>
void main()
{
	int arr[5],sum=0;
	printf("enter the number");
	for(int i=0;i<5;i++)
	{
	scanf("%d",&arr[i]);
	 sum = sum + arr[i];
}
	printf(" sum= %d",sum);
}