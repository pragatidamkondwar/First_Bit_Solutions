#include<stdio.h>
void add(int* , int,int* ,int,int*,int);
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={10,20,30,40,50};
	int crr[5];
	addarray(arr , 5 ,  brr, 5 , crr , 5);
}
 void addarray(int* ptr, int size, int* qtr ,int size1, int* srr , int size2)
{
	for(int i=0;i<5;i++)
	{
	srr[i]= ptr[i]+qtr[i];
	
	printf("%d ",srr[i]);
	}
	
}