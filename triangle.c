void main()
{
	int a=10, b=10, c=30;
	{
		if(a==b&&b==c)
		{
			printf("equilateral");
		}
		else
		{
			if(a==b||b==c||a==c)
			{
				printf("isosceles");
			}
			else
			{
				printf("scalene");
			}
		}
	}
}