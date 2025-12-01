#include<stdio.h>
void maxmin(int* ,int);
void main()
{
	int arr[5]={1,2,3,4,5};
	maxmin(arr,5);
	
}
void maxmin(int* arr,int size)
{
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<size;i++)
	{
		if(arr[i]>max){
			
		max=arr[i];
	}
	if(arr[i]<min)
	{
		min=arr[i];
	}
}
    printf("maximum=%d\n",max);
	printf("minimum=%d",min);
}