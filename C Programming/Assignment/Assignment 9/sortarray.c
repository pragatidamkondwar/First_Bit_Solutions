#include<stdio.h>
void sortarray(int* ,int);
void main()
{
	int arr[5]={8,2,3,4,5};
	sortarray(arr,5);
	
}
void sortarray(int* arr,int size)
{
	int i,j,temp;
	for( i=0;i<5-1;i++)
	{
		for(j=0;j<5-1-i;j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
		
	 for(int i=0;i<5;i++)
	printf("%d",arr[i]);
	
}
