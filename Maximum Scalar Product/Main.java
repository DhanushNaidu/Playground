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
        printf("%d ", arr[i]); 
} 

  
// Driver program to test above functions 

int main() 
{ 
   int n;
  scanf("%d",&n);
  int arr1[n];
  int arr2[n];
  for(int i=0;i<n;i++)
  	scanf("%d",&arr1[i]);
  for(int i=0;i<n;i++)
  	scanf("%d",&arr2[i]);
  Sort(n,arr1);
  Sort(n,arr2);
 int sum=0;
  for(int i = 0; i < n; i++){
   // printf("%d ", sum);
  	sum = sum + arr1[i]*arr2[i];
  }
   printf("%d", sum);
  
  //printArray(arr1,n);
  //printArray(arr2,n);
  return 0; 
} 