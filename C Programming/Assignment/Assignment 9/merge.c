#include<stdio.h>
void merge(int* ,int ,int*,int,int*,int);
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={10,20,30,40,50};
	int crr[5];
	merge(arr,5,brr,5,crr,5);
}
void merge(int*atr ,int size,int* btr,int size1,int* ctr,int size2)
{
	int i,j;
		for(i=0;i<5;i++)
	{
		ctr[i]=atr[i];
	}
		for(j=0;j<5;j++){
		ctr[i]=btr[j];
		i++;
	}
	for(int i=0;i<10;i++)
		printf("%d",ctr[i]);
	
}