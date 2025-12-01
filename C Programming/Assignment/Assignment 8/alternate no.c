#include<stdio.h>
void main()
{
    int arr[5] ,i;
    
    printf("enter the number");
    
    for(i=0;i<5;i++)
    scanf("%d",&arr[i]);
    
	for( i=0;i<5;i=i+2)
	printf("%d",arr[i]);
}