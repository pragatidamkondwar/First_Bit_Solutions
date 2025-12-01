#include<stdio.h>
void start();//function decleration
void main()
{
 start();//function call
}
//main function end here
void start()//function defination
{
	int start=1 ,end=5 , sum=0;
	while(start<=end)
	{
		sum=start+sum;
		
		start++;
	}
	printf("sum=%d\n",sum);
}
