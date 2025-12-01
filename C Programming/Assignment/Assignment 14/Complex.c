#include<stdio.h>
struct Complex
{
   int real;
   int imaginary;	
};
void main()
{
	struct Complex c1,c2;
	c1.real=1;
	c1.imaginary=9;
	printf("real=%d imaginary=%d",c1.real,c1.imaginary);
	
	printf("enter the details of complex number 2");
	scanf("%d %d",&c2.real,&c2.imaginary);
	printf("real=%d imaginary=%d",c2.real,c2.imaginary);
}