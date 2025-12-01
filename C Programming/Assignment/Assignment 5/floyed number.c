#include<stdio.h>
void main()
{
	int n=4,c=1;
	
	for(int i=0;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			printf("%d", c++);
		}
		printf("\n");
		
	}
}