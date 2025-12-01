#include<stdio.h>
int sumall(int*,int);//decleration
void main()
{
	int arr[5];
	printf("enter the number");
	for(int i=0;i<5;i++)
	scanf("%d",&arr[i]);
	int sum=sumall(arr,5);//call
	printf(" sum= %d",sum);
}
int sumall(int* ptr,int size)//defination
{
	int  sum=0;
	for(int i=0;i<5;i++)
	sum = sum + ptr[i];
	return sum;
}