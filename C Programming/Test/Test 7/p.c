#include<stdio.h>
void pallindrome(int*,int);
void main()
{
	int arr[]={121,123};
	pallindrome(arr,2);
}
void pallindrome(int* ptr , int size)
{
	for(int i=0;i<size;i++)
	{
	int no=ptr[i], r1,r2,r3 , rev;
	int q1,q2;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	if(rev=no)
		printf("%d",ptr[i]);
	}
}