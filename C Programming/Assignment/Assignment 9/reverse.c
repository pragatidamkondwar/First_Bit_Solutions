#include<stdio.h>
void reverse(int[], int);
void main()
{

{
    int arr[5] = {1, 2, 3, 4, 5};
    
    reverse(arr, 5);
  }
}
void reverse(int arr[], int size)
{
    int i;
    printf("Array in reverse order: ");
    for(i = size - 1; i >= 0; i--)
    {
        printf("%d ", arr[i]);
    }
}
