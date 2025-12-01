#include<stdio.h>
void rectangle();//function decleration
void main()
{
rectangle();//function call
}
//main end here
void rectangle()//function defination
{
	int len= 20, wid= 30 , rect, perimeter;
	rect= len*wid;
	printf("length and width of rectangle %d ",rect);
	perimeter= 2*(len+wid);
	printf("perimeter of rectangle %d",perimeter);
}
