#include<stdio.h>
void triangle(float*,float*);//function decleration
void main()
 {
 	 float  pi= 3.14 ; 
	  float r;
 	 printf("enter the radius");
 	 scanf("%f",&r);
 	 triangle(&pi,&r);//function call
 }
 //main function end here
 void triangle(float *pi, float *r)//function defination
{
	
    float area=(*pi)*(*r)*(*r);
 	printf("area of circle:%f",area);	
}