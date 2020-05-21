#include<stdio.h>
int main()
{
  //fill your code
  int n, m;
  scanf("%d %d", &n, &m);
  int arr[n];
  for(int i = 0; i < n;i++){
  	scanf("%d", &arr[i]);
  }
  int bus = 1;
  int size = 0;
  for(int i = 0; i < n; i++){
  	size = size + arr[i];
    if(size > m){
      bus++;
      size = arr[i];
    }
  }
  printf("%d", bus);
  return 0;
}