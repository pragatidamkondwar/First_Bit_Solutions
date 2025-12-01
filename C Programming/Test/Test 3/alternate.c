#include<stdio.h>
void main()
{
	
int start=1,end=5,sum=0;
while(start<=end)
{
	sum=start+sum;
	start+=2;
}
printf("sum=%d",sum);

}