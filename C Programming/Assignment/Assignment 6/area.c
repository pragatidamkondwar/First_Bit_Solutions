#include<stdio.h>
void area();//function decleration
 void main()
 {
 	area();//function call
 }
 //main end here
 void area()//function defination
 {
 
  float pi=3.14, r=5, area;
 	 area=pi*r*r;
 	 printf("area of circle:%f",area);
 }