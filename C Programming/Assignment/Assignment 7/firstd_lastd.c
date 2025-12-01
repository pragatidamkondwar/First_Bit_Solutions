#include<stdio.h>
void first(int*,int*,int*);
void main()
{
	int fd , ld ,no;
	printf("enter the number");
	scanf("%d",&no);
	printf("enter the first digit");
	scanf("%d",&fd);
	printf("enter the last digit");
	scanf("%d",&ld);
	first(&fd,&ld,&no);	
}
first(int *fd, int *ld,int *no)
{
		*ld= *no%10;
		while(*no>0)
		{
			*fd=*no%10;
		    *no=*no/10;			
		}
	       int sum=(*ld)+(*fd);
	    printf("sum of fd and ld %d",sum);
}