#include<stdio.h>
void evenodd(int* ,int);
void main()
{
	int arr[5];
	printf("enter the number");
	for(int i=0;i<5;i++)
	scanf("%d",&arr[i]);
	evenodd(&arr[0],5);
}
 void evenodd(int* ptr,int size)
{
	for (int i=0;i<ptr[i];i++)
	{
	if(ptr[i]%2==0)
	{
		printf(" even %d\n",ptr[i]);
	}
		else
		printf("odd %d\n",ptr[i]);
	}
}