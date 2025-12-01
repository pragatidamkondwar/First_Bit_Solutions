#include<stdio.h>
void main()
{
	int unit=25;
	if(unit<=50)
	{
		unit=unit*30;
		printf("%d",unit);
	

		if(unit<=51||unit>=150)
		{
			unit=unit*40;
			printf("%d",unit);
			
		}
		else
		{
			unit=unit*50;
			printf("%d",unit);
		}
	
	}
}