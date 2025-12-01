#include<stdio.h>
void per(float*,float*, float* ,float*,float*);//decleration
void main()
{
	float sub1 ,sub2, sub3, sub4,sub5;
	printf("enter the marks of subject five");
	scanf("%f%f%f%f%f ",&sub1,&sub2,&sub3,&sub4,&sub5);
	 per(&sub1,&sub2,&sub3,&sub4,&sub5);//call
}
//main end here
 void per(float *sub1,float *sub2,float *sub3,float *sub4,float *sub5)
{
 float marks= *sub1+(*sub2)+(*sub3)+(*sub4)+(*sub5);
    printf("total marks %f",marks);
 float percentage= marks/500*100;
    printf("percentage of marks %f", percentage);
}