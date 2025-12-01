#include<stdio.h>
#include<stdlib.h>
void strdupalt(int*,int);
void main()
{
	int arr[5];
	printf("enter the number");
	for(int i=0;i<5;i++)
	scanf("%d",&arr[i]);
	strdupalt(arr,5);
	//printf("%d",res);
}
void strdupalt(int* ptr,int size)
{
	int* dup=(int*) malloc(sizeof(int)*size);
	{
	    for( int i=0;i<size;i=i+2)
	    printf("%d",ptr[i]);
	}
}