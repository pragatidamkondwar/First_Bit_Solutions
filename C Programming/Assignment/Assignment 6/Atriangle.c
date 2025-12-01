#include<stdio.h>
void atriangle();//function decleration
void main()
{
	atriangle();//function call
}
//main function end here

	void atriangle()//function defination
	{
	
	float base = 5 , height = 10,  triangle , area;
	area= 0.5* base * height;
	printf("area of triangle %f", area); 
}