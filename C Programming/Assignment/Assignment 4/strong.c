/* Print strong numbers in the given range 1 to n.*/

#include<stdio.h>
void main()
{
	int no;
	printf("Enter the number");
	scanf("%d",&no);
	for(int j=1;j<=no;j++)
	{
		int no=j;
		int temp=no , sum=0;
		while(no>0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=1;i<=rem; i++)
			fact=fact*i;
			sum=sum+fact;
			no=no/10;
		}
		if(sum==temp)
		printf("%d is strong no\n",temp);
	}
}