#include <stdio.h>

void main() {
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in the array are:\n");
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int isPrime = 1;  

        if (num <= 1) {
            isPrime = 0; 
        } else {
            for (int j = 2;  j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = 0; 
                    break;
                }
            }
        }

        if (isPrime) {
            printf("%d ", num);
        }
    }
}