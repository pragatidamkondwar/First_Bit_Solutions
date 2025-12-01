#include<stdio.h>
void exchange(int*,int);
void main()
{
	int arr[]={11,23,30,4,21,45,50};
	
	exchange(arr,7);
}
void exchange(int*  ptr, int size)
{
		for(int i=0;i<size;i++)
		{
			int temp;
			temp=ptr[2];
			ptr[2]=ptr[4];
			ptr[4]=temp;
			printf("%d", ptr[i]);
			
		}
}