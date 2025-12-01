#include<stdio.h>
void areaT(float*, float*);//function decleration
void main()
{
	float base , height;
	printf("enter the base and height");
	scanf("%f %f",&base, &height);
	areaT(&base,&height);//function call
}
void areaT(float *base, float *height)//function defination
{
    float area= 0.5* *base * *height;
	printf("area of triangle %f", area); 
}