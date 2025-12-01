#include<stdio.h>
int prime(int);
void main()
{
	
	int arr[5]={7,3,4,5,6},i;
	printf("prime numbers");
	for(int i=0;i<5;i++)
	{
	if(prime(arr[i]))
	{
		printf("%d\n",arr[i]);
    }
}
}
int prime(int ptr)
{
	
	if(ptr<=1)
	return 0;
	for(int i=2;i<=ptr/2;i++)
	{
		if(ptr%i==0)
		return 0;
	}
	return 1;
}