#include<stdio.h>
#include<stdlib.h>
void mystrdup(int*,int);
void main()
{
	int arr[5]={2,7,3,9,6};
	mystrdup(arr,5);
}
// main end here
void  mystrdup(int* ptr , int size)
 {
 	int* dup=(int*) malloc (sizeof (int)*size);
 	{
	
 	     int i;
 	    for(i=0;i<size;i++)
 	    {
 	    	if(ptr[i]%2==0)
	      {
		    printf(" even %d\n",ptr[i]);
	     }
		   else
		printf("odd %d\n",ptr[i]);
	      }
	      
    }
 }
