#include<stdio.h>
#include<stdlib.h>
void mystrdup(int*,int);
void main()
{
	int arr[5];
	printf("enter the number");
	for(int i=0;i<5;i++)
	scanf("%d",&arr[i]);
	mystrdup(&arr[0],5);
}// main end here
void mystrdup(int*ptr,int size)
{
	int* dup=(int*) malloc(sizeof(int)*size);
	{
	 int sum=0;
	 sum = sum + ptr[size];
	 printf(" sum= %d",sum);
}
}
