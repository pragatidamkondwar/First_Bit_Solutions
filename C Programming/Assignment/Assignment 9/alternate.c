#include<stdio.h>
void alternate(int*,int);//dec
void main()
{
	int arr[5];
	printf("enter the number");
	alternate(&arr[0],5);
    //printf("%d",res);
}// main end here
void alternate(int* ptr,int size)//def
{ 
    int i;
	for(i=0;i<5;i++)
    scanf("%d",&ptr[i]);
    
	for( i=0;i<5;i=i+2)
      printf("%d",ptr[i]);	
    
}