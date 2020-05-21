#include<stdio.h>
int distinctElement(int* arr, int n){
	int c = 0;
  for(int i = 0; i < n; i++){
  	for(int j = i+1; j < n; j++){
    	if(arr[i] == arr[j])
         c++; 
    }
  }
  return n-c;
}
int main()
{
  //fill your code
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i = 0; i < n; i++){
  	scanf("%d", &arr[i]);
  }
  printf("There are %d distinct elements in the array.", distinctElement(arr,n));
  
  return 0;
}