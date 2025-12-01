#include<stdio.h>
#include<string.h>
struct Time
{
	int Hour;
	int Min;
	int sec;
};
void main()
{
	struct Time T1,T2;
	T1.Hour=2;
	T1.Min=30;
	T1.sec=15;
	printf("%d %d %d",T1.Hour,T1.Min,T1.sec);
	
	printf("enter the details of time 2\n");
	scanf("%d",&T2.Hour);
	scanf("%d",&T2.Min);
	scanf("%d",&T2.sec);
	printf("Hour=%d Min=%d sec=%d",T2.Hour,T2.Min,T2.sec);
}