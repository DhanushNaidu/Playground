#include<stdio.h>
void swap(int *xp, int *yp) 
{ 
    int temp = *xp; 
    *xp = *yp; 
    *yp = temp; 
} 
// A function to implement bubble sort 
void Sort(int n, int* arr) 
{ 
   int i, j; 
   for (i = 0; i < n-1; i++)       
       for (j = 0; j < n-i-1; j++)  
           if (arr[j] > arr[j+1]) 
              swap(&arr[j], &arr[j+1]); 
} 
void printArray(int arr[], int size) 
{ 
    int i;
    for (i=0; i < size; i++) 
        printf("%d\n", arr[i]); 
} 

  
// Driver program to test above functions 

int main() 
{ 
    int n;
  int arr[n];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);

    Sort(n,arr); 
    printf("Sorted array is:\n"); 

    printArray(arr, n); 
    return 0; 
} 