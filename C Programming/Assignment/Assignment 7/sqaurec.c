#include<stdio.h>
 void squarec(int*, int*);//decleration
void main()
{
	int a, b;
	printf("enter the number");
	scanf("%d%d",&a,&b);
	squarec(&a , &b);//call
}
// main end here
 void squarec(int *a , int *b)
{

    a= (*a)*(*a);
    b=(*b)*(*b)*(*b);
	printf("square of number %d",a);
	printf("cube of number %d",b);
}