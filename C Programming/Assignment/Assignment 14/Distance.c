#include<stdio.h>
struct Distance
{
	double feet;
	double inch;
};
void main()
{
	struct Distance d1,d2;
	d1.feet=12;
	d1.inch=2;
	printf("feet=%lf inch=%lf\n",d1.feet,d1.inch);
	
	printf("Enter the details of Distance 2");
	scanf("%lf",&d2.feet);
	scanf("%lf",&d2.inch);
	printf("feet=%lf inch=%lf",d2.feet,d2.inch);
}