#include<stdio.h>
void sum(int*,int ,int*,int ,int* ,int );//decleration
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={10,20,30,40,50};
	int crr[5];
	sum(arr,5,brr,5,crr,5);//call
}
void sum(int* xtr,int size,int*ytr,int size1,int* ztr,int size2)//defination 
{
	for(int i=0;i<5;i++)
	{
		ztr[i]= xtr[i]+ytr[i];
	printf("%d",ztr[i]);
	}
}