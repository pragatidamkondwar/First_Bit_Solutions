#include<stdio.h>
void main()
{
	int arr[5];
	int i,j;
	printf("enter the number");
	for(int i=0;i<5;i++)
	scanf("%d",&arr[i]);
	printf("reverse number\n");
	for(int j=4;j>=0; j--)
    printf("%d\n",arr[j]);
}